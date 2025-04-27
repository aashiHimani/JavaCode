package com.stream.practice;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseElementParrallel {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(11,22,33,44);
        list.parallelStream().collect(Collectors.collectingAndThen(Collectors.toList(),l->{
            Collections.reverse(l); return l.stream();
        })).forEach(System.out::println);

        list.parallelStream().collect(Collectors.toCollection(LinkedList::new)).descendingIterator().forEachRemaining(System.out::println);

        list.parallelStream().collect(Collector.of(()->new ArrayDeque<Integer>(),ArrayDeque::addFirst,(a,b)->{b.addAll(a); return b;})).stream().forEach(System.out::println);
    }
}
