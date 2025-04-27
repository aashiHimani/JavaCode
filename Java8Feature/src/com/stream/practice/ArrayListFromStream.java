package com.stream.practice;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListFromStream {
    public static void main(String[] args) {
        Stream<Integer> st=Stream.of(1,2,3,4);
        ArrayList<Integer> list=new ArrayList<>(st.collect(Collectors.toList()));
        System.out.println(list);
        ArrayList<Integer> list1=new ArrayList<>(st.collect(Collectors.toCollection(ArrayList::new)));
        System.out.println(list1);
    }
}
