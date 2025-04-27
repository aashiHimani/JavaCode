package com.string.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DublicateCountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="big black tree around near park of big black hole";
		List<String> list=Arrays.stream(s.split(" ")).collect(Collectors.toList());
		Map<String, Integer> wordMapWithCount=list.stream().collect(Collectors.toMap(Function.identity(),word->1,Math::addExact));
		Map<String,Integer> dupWordWithCount=wordMapWithCount.entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toMap(Entry::getKey,Entry::getValue));
		System.out.println(dupWordWithCount);
	}

}
