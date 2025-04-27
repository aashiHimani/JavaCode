package com.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StringToList {
    public static void main(String[] args) {
        String s="somu";
        List<Character> list=s.chars().mapToObj(c->(char)c).collect(Collectors.toList());
        System.out.println(list);
    }
}
