package com.generic;

import java.util.HashMap;
import java.util.Map;

public class KeyValuePairsInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<>();
		map.put("orange", 1);
		map.put("blue", 2);
		map.put("black", 3);
		System.out.println(map);
		printMap(map);
	}

	private static <K,V> void printMap(Map<K, V> map) {
		// TODO Auto-generated method stub
		for(Map.Entry(K, V) entry:map.entrySet()) {
			
		}
	}

}
