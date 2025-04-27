package com.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetPractice {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(2);
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        linkedHashSet.add(9);
        linkedHashSet.add(1);
        int index=4;
        Iterator<Integer> it=linkedHashSet.iterator();
        int currIndex =0;
        Integer currElement=null;
        while (it.hasNext()){
            currElement=it.next();
            if(currIndex==index-1){
                System.out.println("Element at index: "+index+" is :"+currElement);
                break;
            }
            currIndex++;
        }
    }
}
