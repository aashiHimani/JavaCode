package com.set;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Practice {
    public static void main(String[] args) {
       TreeSet<Integer> obj=new TreeSet<>();
       obj.add(6);
       obj.add(5);
       obj.add(7);
       obj.add(8);
       obj.add(1);
       obj.add(2);

       TreeSet<Integer> hdset=new TreeSet<>();
       hdset=(TreeSet<Integer>)obj.headSet(6);
        Iterator it=hdset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }
}
