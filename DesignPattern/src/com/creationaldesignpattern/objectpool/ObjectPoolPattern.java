package com.creationaldesignpattern.objectpool;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Enumeration;
import java.util.Hashtable;

//Resusable pool
class PooledObject {
    private Connection connection;
    public PooledObject(Connection connection) {
        this.connection = connection;
    }
    public Connection getConnection() {
        return connection;
    }
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean isClosed() {
        try {
            return connection.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return true;
        }
    }
}

//object pool
abstract class ObjectPool<T> {
    private long deadTime;
    private Hashtable<T, Long> lock, unlock;
    public ObjectPool() {
        deadTime = 50000; // 50 seconds
        lock = new Hashtable<>();
        unlock = new Hashtable<>();
    }
    abstract T create();
    abstract boolean validate(T o);
    abstract void dead(T o);
    public synchronized T takeOut() {
        long now = System.currentTimeMillis();
        T t;
        if (unlock.size() > 0) {
            Enumeration<T> e = unlock.keys();
            while (e.hasMoreElements()) {
                t = e.nextElement();
                if ((now - unlock.get(t)) > deadTime) {
                    unlock.remove(t);
                    dead(t);
                    t = null;
                } else {
                    if (validate(t)) {
                        unlock.remove(t);
                        lock.put(t, now);
                        return t;
                    } else {
                        unlock.remove(t);
                        dead(t);
                        t = null;
                    }
                }
            }
        }
        t = create();
        lock.put(t, now);
        return t;
    }

    public synchronized void takeIn(T t) {
        lock.remove(t);
        unlock.put(t, System.currentTimeMillis());
    }
}

//client
class Client {
    public static void main(String[] args) {
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb: //localhost/mydb",
                "sa", "password");
        Connection con = pool.takeOut();
        pool.takeIn(con);
    }
}

class JDBCConnectionPool extends ObjectPool<Connection> {
    String dsn, usr, pwd;
    JDBCConnectionPool(String driver, String dsn, String usr, String pwd){
        super();
        try {
            Class.forName(driver).newInstance();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        this.dsn = dsn;
        this.usr = usr;
        this.pwd = pwd;
    }

    Connection create() {
        try {
            return (DriverManager.getConnection(dsn, usr, pwd));
        }
        catch (SQLException e) {
            e.printStackTrace();
            return (null);
        }
    }

    void dead(Connection o) {
        try {
            ((Connection)o).close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    boolean validate(Connection o) {
        try {
            return (!((Connection)o).isClosed());
        }
        catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}


public class ObjectPoolPattern {
    public static void main(String[] args) {
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb: //localhost/mydb",
                "sa", "password");

        // Get a connection:
        Connection con = pool.takeOut();
        // Return the connection:
        pool.takeIn(con);
    }
}
