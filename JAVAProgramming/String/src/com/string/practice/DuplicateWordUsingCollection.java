package com.string.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateWordUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="big black tree around near park of big black hole";
		List<String> word=Arrays.asList(s.split(" "));
		Set<String> temp=new HashSet<>();
		List<String> dub=new ArrayList<>();
		for(String w:word) {
			if(!temp.add(w)) {
				dub.add(w);
			}
		}
		System.out.println(dub);
	}

}
