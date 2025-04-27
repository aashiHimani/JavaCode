package com.stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

//Arrays.stream()
public class StreamPractice {
    public static void main(String[] args) {
        String[] arr={"Somu","Himu","Chimpu"};
        Stream<String> str= Arrays.stream(arr);
        str.forEach(System.out::println);

        Integer[] arr1={1,2,3,4,5};
        Stream<Integer> i=Arrays.stream(arr1);
        IntStream ii=i.mapToInt(Integer::intValue);
        ii.forEach(System.out::println);

        Long[] arr2={1L,2L,3L,4L,5L};
        Stream<Long> l=Arrays.stream(arr2);
        LongStream ll=l.mapToLong(Long::longValue);
        ll.forEach(System.out::println);

        Double[] arr3={1.0,2.0,3.0,4.0,5.0};
        Stream<Double> d=Arrays.stream(arr3);
        DoubleStream dd=d.mapToDouble(Double::doubleValue);
        dd.forEach(System.out::println);
    }
}
