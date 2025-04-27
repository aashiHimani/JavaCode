package com.stream.Arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class BoxedArrayToStream {
    public static <T> Stream<T> convertArrayToStream(T array[]) {
        //Arrays.stream()
        return Arrays.stream(array);
        //Stream.of()
        //return Stream.of(array);
        //List.stream()
        //return Arrays.asList(array).stream();
    }
    public static void main(String[] args) {
        String array[] = { "hi","hello","bye" };
        System.out.println("Array:"+Arrays.toString(array));
        Stream<String> stream = convertArrayToStream(array);
        System.out.println("Stream:"+Arrays.toString(stream.toArray()));
    }
}
