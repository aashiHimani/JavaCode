package com.stream;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IterableToStream {
    public static void main(String[] args) {
        Iterable<Integer> integers= Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream= getStream(integers);
        stream.forEach(s->System.out.println(s));
    }

    private static Stream<Integer> getStream(Iterable<Integer> integers) {
        Spliterator<Integer> spliterator= integers.spliterator();
        return StreamSupport.stream(spliterator,false);
    }
}
