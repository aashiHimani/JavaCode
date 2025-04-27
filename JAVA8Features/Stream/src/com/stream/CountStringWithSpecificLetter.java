package com.stream;

import java.util.Arrays;
import java.util.List;

public class CountStringWithSpecificLetter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("lion","kite","love","owl","lamp","knife");
		char start='l';
		long countstring=list.stream().filter(s->s.startsWith(String.valueOf(start))).count();
		System.out.println(countstring);
	}
}
