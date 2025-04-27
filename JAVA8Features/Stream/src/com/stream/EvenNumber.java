package com.stream;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(33, 17, 65, 94, 14, 37, 45);
		list.stream().filter(e->e%2==0).forEach(System.out::println);
		System.out.println("----------------------------");
		list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
		System.out.println("----------------------------");
		list.stream().findFirst().ifPresent(System.out::println);
	}
}
