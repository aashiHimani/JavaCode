package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageNumbeerGreaterThan50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(78,90,32,45,21,56,45,54,65,73);
		double avg=list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println(avg);
	}

}
