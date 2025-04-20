package com.stream.practice;

import java.util.Random;
import java.util.stream.DoubleStream;

public class GenerateInfiniteStreamOfDouble {
    public static void main(String[] args) {
        DoubleStream.iterate(0,i->i+1).forEach(System.out::println);

        Random random=new Random();
        random.doubles().forEach(System.out::println);
        DoubleStream.generate(random::nextDouble).forEach(System.out::println);

    }
}
