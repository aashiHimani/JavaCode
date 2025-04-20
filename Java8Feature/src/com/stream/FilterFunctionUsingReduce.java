package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterFunctionUsingReduce {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> even=list.stream().reduce(new ArrayList<Integer>(),(a,b)->{
            if(b%2==0)
                a.add(b);
            return a;},(a,b)->{a.addAll(b); return a;});
        System.out.println(even);
    }
}
