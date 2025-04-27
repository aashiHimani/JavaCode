package com.stream.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LastElement {
    public static void main(String[] args) {
        Stream<String> stream= Stream.of("Hi","Hello","Bye","Somu");
        int N=4;
        String st= stream.reduce((f, s)->s).orElse(null);
        System.out.println(st);
        String str=stream.skip(N-1).findFirst().orElse(null);
        System.out.println(str);
        List<Integer> integers= Arrays.asList(1,2,3,4,5,6,7,8);
        Integer ele= integers.stream().sorted(Collections.reverseOrder()).findFirst().orElse(null);
        System.out.println(ele);
    }
}
