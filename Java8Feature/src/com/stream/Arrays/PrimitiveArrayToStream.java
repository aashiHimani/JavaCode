package com.stream.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimitiveArrayToStream {
    public static IntStream convertArrayToStream(int array[]){
        //Arrays.stream()
        return Arrays.stream(array);
        //IntStream.of()
        //return IntStream.of(array);
    }
    public static void main(String[] args) {
        int[] array = new int[] { 3, 2, 5, 4, 1 };
        System.out.println("Array:"+Arrays.toString(array));
        IntStream stream = convertArrayToStream(array);
        System.out.println("Stream:"+Arrays.toString(stream.toArray()));
    }
}
