package com.creationaldesignpattern.singleton;

public class SingletonDesignPattern {
    //ensures that memory is allocated only once,preserving single instance of Singleton class.
    private static SingletonDesignPattern instance;
    //which serves as a barricade against external attempts to create instances of Singleton class.
    // This ensures that class has control over its instantiation process.
    private SingletonDesignPattern(){
        System.out.println("singleton instantiated");
    }
    //A crucial aspect of Singleton pattern is presence of a static factory method.
    // This method acts as a gateway, providing a global point of access to Singleton object.
    // When someone requests an instance, this method either creates a new instance (if none exists) or
    // returns the existing instance to the caller.
    public static SingletonDesignPattern getInstance(){
        if(instance==null)
            instance=new SingletonDesignPattern();
        return instance;
    }

    //thread
    /*
    public static SingletonDesignPattern getInstance(){
        synchronized (SingletonDesignPattern.class){
            if(instance==null)
                instance=new SingletonDesignPattern();
        }
        return instance;
    } */
    public static void main(String[] args) {
        SingletonDesignPattern.getInstance();
    }
}
