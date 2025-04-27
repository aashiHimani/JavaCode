package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurWordUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		Map<String, Integer> map=new HashMap<String,Integer>();
		String[] word=str.split("\\s+");
		for(String w:word) {
			w=w.toLowerCase();
			map.put(w, map.getOrDefault(w, 0)+1);
		}
		
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}

}
