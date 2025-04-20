package com.lambdaexpression;

interface MyInterface{
    void myFunc();
}
public class InstanceVariables {
    int x=10;

    public static void main(String[] args) {
        InstanceVariables obj=new InstanceVariables();
        MyInterface myInterface=()->{
            System.out.println("x:"+obj.x);
            obj.x+=20;
            System.out.println("after modification:"+obj.x);
        };
        myInterface.myFunc();
        obj.x+=100;
        System.out.println("data: "+obj.x);
    }

}
//Unlike local variables, instance variables are not subject to the effectively final restriction,
// so they can be modified both inside and outside the lambda expression.