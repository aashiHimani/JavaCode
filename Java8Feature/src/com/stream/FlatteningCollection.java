package com.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatteningCollection {
    public static void main(String[] args) {
        Map<Integer, List<String>> map=new HashMap<>();
        map.put(1, Arrays.asList("1","2","3"));
        map.put(2,Arrays.asList("4","5","6"));
        List<String> list=map.values().stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(list);

        String[] a={"A","B","C"};
        String[] b={"D","E","F"};
        String[] s=Stream.of(a,b).flatMap(Arrays::stream).toArray(String[]::new);
        System.out.println(Arrays.toString(s));
    }
}
