package com.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        //add(Object element)
        set.add(1);
        //clear()
        set.clear();
        //contains(Object element)
        set.contains(1);
        //remove(Object O)
        set.remove(1);
        //iterator()
        //isEmpty()
        set.isEmpty();
        //size()
        set.size();
        //clone()
        set.clone();//return a shallow copy of the mentioned hash set. It just creates a copy of the set.


        Set<Integer> newSet=new HashSet<>();
        newSet.add(11);
        newSet.add(24);
        newSet.add(34);
        newSet.add(43);
        newSet.add(55);
        newSet.add(66);
        Integer arr[]=newSet.toArray(new Integer[newSet.size()]);
        Random random=new Random();
        int rnum=random.nextInt(newSet.size());
        System.out.println(arr[rnum]);
    }
}
