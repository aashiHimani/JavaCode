package com.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToArray {

    public static <T> Object[] convertStreamToArray(Stream<T> stream) {
        //Using toArray()
        return stream.toArray();
        //Using toArray(IntFunction generator)
        //return stream.toArray(Object[] ::new);
    }
//    public static int[] convertStreamToArray(Stream<Integer> stream) {
//        //Stream to int[] using mapToInt()
//        return stream.mapToInt(Integer::intValue).toArray();
//    }

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        Object[] array = convertStreamToArray(stream);
        System.out.println("Array from Stream:"+Arrays.toString(array));
    }
}
