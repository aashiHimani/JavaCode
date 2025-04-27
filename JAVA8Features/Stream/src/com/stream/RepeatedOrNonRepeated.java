package com.stream;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedOrNonRepeated {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi My name is Himani Kumari";
		//non repeated first
		Character ch=str.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char) s))).
				collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()==1L).map(e->e.getKey()).findFirst().get();
		System.out.println(ch);
		//repeated first
		Character ch1=str.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char) s))).
				collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()>1L).map(e->e.getKey()).findFirst().get();
		System.out.println(ch1);
	}
}
