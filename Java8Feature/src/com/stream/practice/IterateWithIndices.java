package com.stream.practice;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class IterateWithIndices {
    public static void main(String[] args) {
        String[] arr={"S","O","M","U"};
        IntStream.range(0, arr.length).mapToObj(index->String.format("%d->%s",index,arr[index])).forEach(System.out::println);

        AtomicInteger in=new AtomicInteger();
        Arrays.stream(arr).map(st->in.getAndIncrement()+"->"+st).forEach(System.out::println);
    }
}
