package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingAlphabeticalorder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Hen","Boat","Owl","Lion","Apple");
		List<String> a=list.stream().sorted().collect(Collectors.toList());
		System.out.println(a);
		List<String> b=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(b);
	}
}
