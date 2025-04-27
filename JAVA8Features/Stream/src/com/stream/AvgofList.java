package com.stream;

import java.util.ArrayList;
import java.util.List;

public class AvgofList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(9);
		list.add(6);
		list.add(1);
		list.add(7);
		double avg=list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println(avg);
	}
}
