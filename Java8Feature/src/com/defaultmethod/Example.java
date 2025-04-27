package com.defaultmethod;

import java.util.Comparator;

interface TestInterface {
    public void square(int a);
    default void show() {
        System.out.println("Default Method Executed");
    }
}

public class Example implements TestInterface{
    public void square(int a) {
        System.out.println(a*a);
    }
    public static void main(String[] args) {
        Example d = new Example();
        d.square(4);
        d.show();
    }
}
