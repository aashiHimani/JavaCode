package com.stream.practice;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class GenerateInfinteStreamOfInteger {
    public static void main(String[] args) {
        IntStream.iterate(0, i->i+1).forEach(System.out::println);

        Random random=new Random();
        random.ints().forEach(System.out::println);
        IntStream.generate(random::nextInt).forEach(System.out::println);
    }
}
