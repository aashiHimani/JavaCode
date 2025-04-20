package com.lambdaexpression;

interface funcInterface2{
    void print(int x,int y);
}
public class MultiParameter {
    static void fun(funcInterface2 f, int x,int y){
        f.print(x,y);
    }
    public static void main(String[] args) {
        fun((x,y)-> System.out.println(x+" "+y),10,20);
    }
}
