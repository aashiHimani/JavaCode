package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //Object[] toArray()
        Object[] obj=list.toArray();
        for(Object al: obj){
            System.out.print(al+" ");
        }
        System.out.println();

        //T[] toArray(T[] a)
        Integer[] arr=new Integer[list.size()];
        arr=list.toArray(arr);
        for(Integer al: arr){
            System.out.print(al+" ");
        }
        System.out.println();

        //get()
        Integer[] ar=new Integer[list.size()];
        for(int i=0;i<list.size();i++){
            ar[i]=list.get(i);
        }
        for(Integer i:ar){
            System.out.print(i+" ");
        }
        System.out.println();

        //stream
        int[] a=list.stream().mapToInt(n->n).toArray();
        for(int z:a){
            System.out.print(z+" ");
        }
        System.out.println();
    }
}
