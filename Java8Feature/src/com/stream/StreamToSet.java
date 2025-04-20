package com.stream;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToSet {
    public static void main(String[] args) {
        Stream<Integer> stream=Stream.of(-2,-1,0,1,2);
        Set<Integer> set=stream.collect(Collectors.toSet());
        set.forEach(s->System.out.println(s));

        //stream to array then set
        Stream<String> stream1=Stream.of("H","I","M","U");
        String[] arr=stream1.toArray(String[]::new);
        Set<String> set1=new HashSet<>();
        Collections.addAll(set1,arr);
        set1.forEach(s->System.out.println(s));

        //forEach
        Set<Integer> s=new HashSet<>();
        stream.forEach(s::add);
        s.forEach(st->System.out.println(st));
    }
}
