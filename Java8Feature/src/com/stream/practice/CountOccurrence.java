package com.stream.practice;

public class CountOccurrence {
    public static void main(String[] args) {
        String str="HiHelloBye";
        char c='H';
        System.out.println(str.chars().filter(ch -> ch == c).count());
    }
}
