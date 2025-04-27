package com.lambdaexpression;

interface funcInterface{
    void print();
}

public class NoParameter {
    static void fun(funcInterface f){
        f.print();
    }

    public static void main(String[] args) {
        fun(()-> System.out.println("Hello"));
    }
}
