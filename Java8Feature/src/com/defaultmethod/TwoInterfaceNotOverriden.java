package com.defaultmethod;

interface Test1{
    public default void display() {
        System.out.println("test");
    }
}
interface Test2{
    public default void display() {
        System.out.println("test1");
    }
}
//public class TwoInterfaceNotOverriden implements Test1,Test2{
//    public static void main(String[] args) {
//        TwoInterfaceNotOverriden obj = new TwoInterfaceNotOverriden();
//        obj.display();
//    }

//    @Override
//    public void display() {
//        Test1.super.display();
//    }
//}
