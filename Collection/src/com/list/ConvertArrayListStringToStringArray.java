package com.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListStringToStringArray {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Somu");
        list.add("Chimpu");
        list.add("Himu");
        System.out.println(list);

        //using get()
        String[] arr=new String[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        for(String s:arr){
            System.out.println(s);
        }

        //using toArray()
        String[] st=list.toArray(new String[list.size()]);
        for(String s:st){
            System.out.println(s);
        }

        //using copyOf()
        String[] str= Arrays.copyOf(list.toArray(),list.size(),String[].class);
        System.out.println(Arrays.toString(str));
    }
}
