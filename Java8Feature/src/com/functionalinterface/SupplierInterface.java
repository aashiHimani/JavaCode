package com.functionalinterface;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String args[])
    {
        Supplier<Double> randomValue=()->Math.random();
        System.out.println(randomValue.get());
    }
}
