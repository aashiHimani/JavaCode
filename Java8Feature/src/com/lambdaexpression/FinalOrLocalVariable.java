package com.lambdaexpression;

interface MyInterface1{
    int func(int x);
}
public class FinalOrLocalVariable {
    public static void main(String[] args) {
        int n=10;
        MyInterface1 myInterface1=(x)->{
            int val=n+x;
            return val;
        };
        System.out.println(myInterface1.func(20));
    }
}
//number is effectively final and can, therefore, be used inside myLambda.
// However, if number were to be modified, either inside the lambda or outside of it,
// number would lose its effective final status. This would cause an error,
// and the program would not compile.
