package com.stream.Arrays;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Average {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).asDoubleStream().forEach(s->System.out.print(s+" "));
        System.out.println();
        Arrays.stream(arr).asLongStream().forEach(s->System.out.print(s+" "));
        System.out.println();
        IntPredicate predicate=e->e%5==0;
        System.out.println(Arrays.stream(arr).anyMatch(predicate));
        System.out.println(Arrays.stream(arr).allMatch(e->e%2==0));
        System.out.println(Arrays.stream(arr).noneMatch(e->e%2==0));
        System.out.println(Arrays.stream(arr).average());
        System.out.println(Arrays.stream(arr).findAny());
        System.out.println(Arrays.stream(arr).findFirst());
        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).min());
        System.out.println(Arrays.stream(arr).reduce((x,y)->x+y));
        System.out.println(Arrays.stream(arr).average().getAsDouble());
        System.out.println(Arrays.stream(arr).findAny().getAsInt());
    }
}
