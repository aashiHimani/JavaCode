package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SliceOfStream {
    public static <T> Stream<T> getSliceOfStream(Stream<T> stream, int startIndex, int endIndex) {
        //Using skip() and limit()
        return stream.skip(startIndex).limit(endIndex - startIndex + 1);
        //Using Collectors along with skip() and limit()
        //return stream.collect(Collectors.collectingAndThen(Collectors.toList(), list -> list.stream().skip(startIndex).limit(endIndex - startIndex + 1)));
        //Fetching a SubList
        //return stream.collect(Collectors.toList()).subList(startIndex, endIndex + 1).stream();
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 11; i <= 20; i++)
            list.add(i);
        Stream<Integer> intStream = list.stream();
        System.out.println("List: " + list);
        Stream<Integer> sliceOfIntStream = getSliceOfStream(intStream, 4, 8);
        System.out.println("\nSlice of Stream:");
        sliceOfIntStream.forEach(System.out::println);
    }
}
