package com.generic;

import java.util.ArrayList;
import java.util.List;

public class ReverseListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(2,6,9,4,1);
		List<String> color=List.of("red","white","black");
		
		List<Integer> reverseNumber=reversedList(list);
		System.out.println("original list:"+list);
		System.out.println("reversed list:"+reverseNumber);
		
		List<String> reverseString=reversedList(color);
		System.out.println("original list:"+color);
		System.out.println("reversed list:"+reverseString);
	}

	private static <T> List<T> reversedList(List<T> list) {
		// TODO Auto-generated method stub
		List<T> reverse=new ArrayList<>();
		for(int i=list.size()-1;i>=0;i--) {
			reverse.add(list.get(i));
		}
		return reverse;
	}

}
