package com.defaultmethod;

interface Print{
    public default void display() {
        System.out.println("print");
    }
}

interface Print1{
    public default void display() {
        System.out.println("print1");
    }
}

public class TwoInterfaceOverride implements Print,Print1{
    public static void main(String[] args) {
        TwoInterfaceOverride obj = new TwoInterfaceOverride();
        obj.display();
    }
    public void display() {
        Print.super.display();
        Print1.super.display();
    }
}
