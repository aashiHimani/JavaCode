package com.stream.practice;

import java.util.stream.Stream;

public class FirstElement {
    public static void main(String[] args) {
        Stream<String> stream= Stream.of("Hi","Hello","Bye","Somu");
        String st= stream.reduce((f, s)->f).orElse(null);
        System.out.println(st);
        String str=stream.findFirst().orElse(null);
        System.out.println(str);
    }
}
