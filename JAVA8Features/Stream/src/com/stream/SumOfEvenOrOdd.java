package com.stream;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenOrOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(2,9,8,4,5,7,1);
		int even=list.stream().filter(e->e%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(even);
		int odd=list.stream().filter(e->e%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println(odd);
	}
}
