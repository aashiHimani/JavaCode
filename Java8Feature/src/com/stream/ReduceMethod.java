package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class ReduceMethod {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("himu","hello","bye");
        Optional<String> longest=list.stream().reduce((w1, w2)->w1.length()>w2.length()?w1:w2);
        longest.ifPresent(System.out::println);

        List<String> list1= Arrays.asList("hi","hello","bye");
        Optional<String> combine=list1.stream().reduce((c1,c2)->c1+"-"+c2);
        combine.ifPresent(System.out::println);

        List<Integer> list3= Arrays.asList(2,3,4,5,6);
        int sum= Integer.parseInt(list.stream().reduce(String.valueOf(0),(c1, c2)->c1+c2));
        System.out.println(sum);

        int product= IntStream.range(2,8).reduce((n1,n2)->n1*n2).orElse(-1);
        System.out.println(product);
    }
}
