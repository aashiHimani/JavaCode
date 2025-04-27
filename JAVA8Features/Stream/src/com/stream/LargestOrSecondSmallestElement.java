package com.stream;

import java.util.Arrays;
import java.util.List;

public class LargestOrSecondSmallestElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(33, 17, 65, 94, 14, 37, 45);
		Integer largest=list.stream().distinct().sorted((a,b)->Integer.compare(b,a)).findFirst().orElse(null);
		System.out.println(largest);
		Integer secondLargest=list.stream().distinct().sorted((a,b)->Integer.compare(b,a)).skip(1).findFirst().orElse(null);
		System.out.println(secondLargest);
		Integer secondSmallest=list.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		System.out.println(secondSmallest);
	}
}
