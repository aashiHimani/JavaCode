package com.string.concatenation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingCollectorsJoiningMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=Arrays.asList("Himu","somu","chimpu");
		String list=s.stream().collect(Collectors.joining(","));
		System.out.println(list.toString());
	}

}
