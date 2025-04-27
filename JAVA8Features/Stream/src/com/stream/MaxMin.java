package com.stream;

import java.util.Arrays;
import java.util.List;

public class MaxMin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(6,4,9,2,8);
		Integer max=list.stream().max(Integer::compare).orElse(0);
		System.out.println(max);
		Integer min=list.stream().min(Integer::compare).orElse(0);
		System.out.println(min);
	}
}
