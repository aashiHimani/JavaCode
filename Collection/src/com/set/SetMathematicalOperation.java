package com.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMathematicalOperation {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        Set<Integer> set1=new HashSet<>();
        set1.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));

        Set<Integer> union=new HashSet<>(set);
        union.addAll(set1);
        System.out.println("Union of two set:"+union);

        Set<Integer> intersection=new HashSet<>(set);
        intersection.retainAll(set1);
        System.out.println("Intersection of two set:"+intersection);

        Set<Integer> difference=new HashSet<>(set);
        difference.removeAll(set1);
        System.out.println("Difference of two set:"+difference);
    }
}
