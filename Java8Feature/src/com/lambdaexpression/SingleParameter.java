package com.lambdaexpression;

interface funcInterface1{
    void print(int x);
}

public class SingleParameter {
    static void fun(funcInterface1 f, int x){
        f.print(x);
    }
    public static void main(String[] args) {
        fun(x-> System.out.println(x),10);
    }
}
