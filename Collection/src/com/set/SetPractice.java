package com.set;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();

        //add(E element)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        Set<Integer> set1=new HashSet<>();
        set1.add(5);
        set1.add(6);

        //addAll(Collection C)
        set.addAll(set1);
        System.out.println(set);

        //clear()
        //contains(Object element)
        //containsAll(Collection C)
        //hashCode()
        //isEmpty()
        //remove(Object O)   removeAll(Collection c)
        //size()
        //toArray()
        //retainAll(Collection c)
    }
}
