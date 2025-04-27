package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class UsingCollections {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(98);
        arrayList.add(27);
        arrayList.add(34);
        System.out.println("Element of arraylist:"+arrayList);
        Collections.sort(arrayList,(o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
        System.out.println("Element of arraylist after sort:"+arrayList);

        TreeSet<Integer> treeSet=new TreeSet<>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
        treeSet.add(85);
        treeSet.add(23);
        treeSet.add(10);
        treeSet.add(15);
        treeSet.add(8);
        System.out.println("Element of treeset after sort:"+treeSet);

        TreeMap<Integer,String> treeMap=new TreeMap<>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
        treeMap.put(1,"Apple");
        treeMap.put(4,"Mango");
        treeMap.put(5,"Orange");
        treeMap.put(2,"Banana");
        treeMap.put(3,"Grapes");
        System.out.println("Element of treemap after sort:"+treeMap);

        TreeSet<String> treeSet1=new TreeSet<>((a,b)->b.compareTo(a));
        treeSet1.add("a");
        treeSet1.add("b");
        treeSet1.add("c");
        treeSet1.add("d");
        treeSet1.add("e");
        System.out.println("Element of treeset after sort in reverse:"+treeSet1);
    }
}
