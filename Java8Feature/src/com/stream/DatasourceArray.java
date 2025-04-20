package com.stream;

import java.util.Arrays;

public class DatasourceArray {
    public static void main(String[] args) {
        Integer[] num={1,2,3,4,5,6,7,8,9};
        Arrays.stream(num).filter(n->n%2==0).forEach(n-> System.out.println(n));
    }
}
