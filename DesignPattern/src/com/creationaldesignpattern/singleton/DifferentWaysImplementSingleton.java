package com.creationaldesignpattern.singleton;

public class DifferentWaysImplementSingleton {
    private static DifferentWaysImplementSingleton obj;
    private DifferentWaysImplementSingleton(){}

    /*
    declared getInstance() static so that we can call it without instantiating class.first time
    getInstance() is called it creates a new singleton object & after that,it just returns the same object
    not thread safe
     */
    public static DifferentWaysImplementSingleton getInstance(){
        if(obj==null)
            obj=new DifferentWaysImplementSingleton();
        return obj;
    }

    /*
    using synchronized makes sure that only one thread at a time can execute getInstance().
    main disadvantage of this method is that using synchronized every time while creating singleton object
    is expensive & may decrease performance of your program. However, if performance of getInstance()
    is not critical for your application this method provides a clean & simple solution.
     */
    public static synchronized DifferentWaysImplementSingleton getInstance1(){
        if(obj==null)
            obj=new DifferentWaysImplementSingleton();
        return obj;
    }

    /*
    created an instance of a singleton in a static initializer. JVM executes a static initializer when
    class is loaded & hence this is guaranteed to be thread-safe. Use this method only when your
    singleton class is light & is used throughout execution of your program.
     */
    private static DifferentWaysImplementSingleton obj1 = new DifferentWaysImplementSingleton();
    public static DifferentWaysImplementSingleton getInstance2() { return obj1; }

    /*
    once an object is created synchronization is no longer useful because now obj will not be null & any
    sequence of operations will lead to consistent results. So we will only acquire lock on getInstance()
    once when obj is null.This way we only synchronize first way through, just what we want
    We have declared obj volatile which ensures that multiple threads offer obj variable correctly when
    it is being initialized to Singleton instance.This method drastically reduces overhead of calling
    synchronized method every time.
     */
    private static volatile DifferentWaysImplementSingleton obj2 = null;
    public static DifferentWaysImplementSingleton getInstance3(){
        if (obj == null) {
            synchronized (DifferentWaysImplementSingleton.class){
                if (obj == null)
                    obj = new DifferentWaysImplementSingleton();
            }
        }
        return obj2;
    }

    /*
    a private static inner class SingletonInner & having private field. Through, getInstance() method of
    singleton class,access field of inner class,& due to being inner class,it will be loaded only one time
    at time of accessing INSTANCE field first time.& INSTANCE is a static member due to which it will be
    initialized only once.
     */
    private static class SingletonInner{
        private static final DifferentWaysImplementSingleton INSTANCE=new DifferentWaysImplementSingleton();
    }
    public static DifferentWaysImplementSingleton getInstance4(){
        return SingletonInner.INSTANCE;
    }



    public static void main(String[] args) {

    }
}
