package com.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnyValueToList {
    public static void main(String[] args) {
        int N=123;
        String str="SOMU";
        int size=1;
        System.out.println(Stream.generate(String::new).limit(size).map(s->N).collect(Collectors.toList()));
        System.out.println(Stream.generate(String::new).limit(size).map(s->str).collect(Collectors.toList()));
    }
}
