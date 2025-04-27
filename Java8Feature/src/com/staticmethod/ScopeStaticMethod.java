package com.staticmethod;

interface PrintDemo {
    static void hello() {
        System.out.println("Called from Interface PrintDemo");
    }
}

public class ScopeStaticMethod implements PrintDemo{
    public static void main(String[] args) {
        PrintDemo.hello();
        hello();
    }
    static void hello() {
        System.out.println("Called from Class");
    }
}
