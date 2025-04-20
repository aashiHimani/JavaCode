package com.stream.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElement {
    public static void main(String[] args) {
        Stream<Integer> st=Stream.of(5,13,4,21,13,27,2,59,59,34);
        Set<Integer> set=new HashSet<>();
        st.filter(n->!set.add(n)).collect(Collectors.toSet()).forEach(s->System.out.println(s));
        System.out.println();
        st.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
                .filter(s->s.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet()).forEach(s-> System.out.println(s));
        System.out.println();
        st.filter(i-> Collections.frequency((Collection<?>) st,i)>1).collect(Collectors.toSet()).forEach(s-> System.out.println(s));
    }
}
