package com.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SetToStream {
    //Collection.stream()
    private static <T> Stream<T> convertSetToStream(Set<T> set) {
        return set.stream();
    }
    //Using Predicate to filter the Stream
    private static <T> Stream<T> convertSetToStream(Set<T> set, Predicate<T> predicate) {
        return set.stream().filter(predicate);
    }

    public static void main(String[] args) {
        Set<Integer> setOfInteger = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10));
        System.out.println("Set of Integer: " + setOfInteger);
        Stream<Integer> streamOfInteger = convertSetToStream(setOfInteger);
        System.out.println("Stream of Integer:"+Arrays.toString(streamOfInteger.toArray()));


        Set<String> setOfString = new HashSet<>(Arrays.asList("hi","hello","bye"));
        System.out.println("Set of String: " + setOfString);
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("G");
            }
        };
        Stream<String> streamOfString = convertSetToStream(setOfString, predicate);
        System.out.println("Stream from List with items"+" starting with G: ");
        System.out.println(Arrays.toString(streamOfString.toArray()));
    }
}
