package com.stream;

import java.util.stream.Stream;

public class ofMethod {
    public static void main(String[] args) {
        String[] arr={"Somu","Himu","Chimpu"};
        Stream<String> str= Stream.of(arr);
        str.forEach(System.out::println);

        Integer[] arr1={1,2,3,4,5};
        Stream<Integer> i=Stream.of(arr1);
        i.forEach(System.out::println);

        Long[] arr2={1L,2L,3L,4L,5L};
        Stream<Long> l=Stream.of(arr2);
        l.forEach(System.out::println);

        Double[] arr3={1.0,2.0,3.0,4.0,5.0};
        Stream<Double> d=Stream.of(arr3);
        d.forEach(System.out::println);
    }
}
