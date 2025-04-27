package com.staticmethod;

interface NewInterface {
    static void hello() {
        System.out.println("Hello, New Static Method Here");
    }
    void overrideMethod(String str);
}
public class Example implements NewInterface{
    public static void main(String[] args) {
        Example interfaceDemo = new Example();
        NewInterface.hello();
        interfaceDemo.overrideMethod("Hello, Override Method here");
    }

    @Override
    public void overrideMethod(String str) {
        System.out.println(str);
    }
}
