package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(3,0,8,1,3,9,1,0);
		List<Integer> remove=list.stream().distinct().collect(Collectors.toList());
		System.out.println(remove);
	}
}
