package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ListToStream {
    // List.stream() method
    private static <T> Stream<T> convertListToStream(List<T> list) {
        return list.stream();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hi","hello","bye");
        System.out.println("List: " + list);
        Stream<String> stream = convertListToStream(list);
        System.out.println("Stream from List: " +Arrays.toString(stream.toArray()));

        //Filter Stream using a Predicate
        List<String> list1 = Arrays.asList("hi","hello","bye");
        System.out.println("List: " + list1);
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("G");
            }
        };
        System.out.println("Stream from List with items"+" starting with G: ");
        list1.stream().filter(predicate).forEach(System.out::println);
    }
}
