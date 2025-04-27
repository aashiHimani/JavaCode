package com.string.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DublicateWordUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="big black tree around near park of big black hole";
		List<String> word=Arrays.stream(s.split(" ")).collect(Collectors.toList());
		Set<String> temp=new HashSet<>();
		List<String> dw=word.stream().filter(w->!temp.add(w)).collect(Collectors.toList());
		System.out.println(dw);
	}
	
}
