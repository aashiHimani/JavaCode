package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringToUpperCaseOrLowerCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("himu","Somu","Aashi","lucky");
		List<String> uppercase=list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercase);
		List<String> lowercase=list.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(lowercase);
	}

}
