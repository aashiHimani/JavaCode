package com.generic;

import java.util.ArrayList;
import java.util.List;

public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=List.of(4,9,2,1);
		List<Integer> list2=List.of(7,3,5,6);
		System.out.println("list of numbers:");
		System.out.println(list1);
		System.out.println(list2);
		List<Integer> mergeNumber=mergeList(list1,list2);
		System.out.println("merged list :"+mergeNumber);
		
		List<String> color1=List.of("red","blue","black","white");
		List<String> color2=List.of("green","yellow","orange");
		System.out.println("list of String:");
		System.out.println(color1);
		System.out.println(color2);
		List<String> mergeString=mergeList(color1,color2);
		System.out.println("merged list :"+mergeString);
	}

	private static <T> List<T> mergeList(List<T> list1, List<T> list2) {
		// TODO Auto-generated method stub
		List<T> merge=new ArrayList<>();
		int maxLength=Math.max(list1.size(),list2.size());
		for(int i=0;i<maxLength;i++) {
			if(i<list1.size()) {
				merge.add(list1.get(i));
			}
			if(i<list2.size()) {
				merge.add(list2.get(i));
			}
		}
		return merge;
	}

}
