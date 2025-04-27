package com.string.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DublicateCountWordUsingCollection {

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
		Map<String,Integer> count=new HashMap<>();
		for(String w:dub) {
			count.put(w,Collections.frequency(word,w));
		}
		System.out.println(count);
	}

}
