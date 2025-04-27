package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateValueusingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
	    map.put("B", 2);
	    map.put("C",2);
	    map.put("D",3);
	    map.put("E", 3);
		//Map<String,Integer> re=map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(ev,nv)->ev));
		//re.forEach((key,value)->System.out.println(key+":"+value));
	    Set<String> set = map.keySet();
	    Iterator<String> keyIter = set.iterator();

	    while (keyIter.hasNext()) {
	        String key = keyIter.next();
	        Integer value = map.get(key);
	        map.put(key, value);
	    }
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" :"+entry.getValue());
		}
		
	}

}
