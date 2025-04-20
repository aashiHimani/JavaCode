package com.defaultmethod;


interface  Test{
    public default void display() {
        System.out.println("test");
    }
}
public class OverrideDefaultMethod implements Test{
    public static void main(String[] args) {
        OverrideDefaultMethod obj = new OverrideDefaultMethod();
        obj.display();
    }
}
