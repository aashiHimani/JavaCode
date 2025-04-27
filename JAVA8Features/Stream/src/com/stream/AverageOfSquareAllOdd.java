package com.stream;

import java.util.Arrays;
import java.util.List;

public class AverageOfSquareAllOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(2,7,4,8,3,5);
		double avg=list.stream().filter(e->e%2!=0).mapToDouble(e->e*e).average().orElse(0.0);
		System.out.println(avg);
	}

}
//49,9,25