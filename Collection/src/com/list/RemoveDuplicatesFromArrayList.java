package com.list;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5));

        //using iterator
        ArrayList<Integer> newList=new ArrayList<>();
        for(Integer e: list){
            if(!newList.contains(e)){
                newList.add(e);
            }
        }
        System.out.println("Using iterator:"+newList);

        //using LinkedHashSet
        Set<Integer> set=new LinkedHashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        System.out.println("using set:"+list);

        //using stream
        ArrayList<Integer> list1= new ArrayList<Integer>(Arrays.asList(1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5));
        List<Integer> l=list1.stream().distinct().collect(Collectors.toList());
        System.out.println("Using stream:"+l);

    }


}
