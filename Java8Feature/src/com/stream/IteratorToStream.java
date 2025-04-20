package com.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;


public class IteratorToStream {
    public static void main(String[] args) {
        Iterator<Integer> i= Arrays.asList(1,2,3,4,5).iterator();
        Stream<Integer> stream=getStreamIterator(i);
        stream.forEach(s->System.out.println(s));
    }

    private static Stream<Integer> getStreamIterator(Iterator<Integer> i) {
        Spliterator<Integer> spliterator= Spliterators.spliteratorUnknownSize(i,0);
        return StreamSupport.stream(spliterator,false);
    }
}
