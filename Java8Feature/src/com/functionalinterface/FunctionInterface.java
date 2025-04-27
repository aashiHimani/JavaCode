package com.functionalinterface;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String args[])
    {
        //apply
        Function<Integer,Double> half=a->a/2.0;
        System.out.println(half.apply(10));

        //andThen
        half=half.andThen(a->3*a);
        System.out.println(half.apply(10));
        //null exception
        try {
            half=half.andThen(null);
        }
        catch (Exception e) {
            System.out.println("Exception thrown while passing null: "+e);
        }

        //compose
        half=half.compose(a->3*a);
        System.out.println(half.apply(5));
        //null exception
        try {
            half = half.compose(null);
        }
        catch (Exception e) {
            System.out.println("Exception thrown while passing null: "+e);
        }

        //identity
        Function<Integer,Integer>i=Function.identity();
        System.out.println(i.apply(10));
    }
}
