package com.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEachCharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi My name is Himani Kumari";
		Map<Object, Long> m=Arrays.stream(str.split("")).map(String::toLowerCase).
				collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));
		System.out.println(m);
	}
}
