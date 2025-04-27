package com.generic;

import java.util.List;

public class FindIndexOfTargetElementOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(4,5,2,8,6);
		System.out.println("find index :"+findIndex(list,4));
		System.out.println("find index :"+findIndex(list,3));
		System.out.println("find index :"+findIndex(list,8));
		
		List<String> color=List.of("red","black","white");
		System.out.println("find index :"+findIndex(color,"white"));
		System.out.println("find index :"+findIndex(color,"blue"));
	}
	

	private static <T> int findIndex(List<T> list, T tt) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(tt)) {
				return i;
			}
		}
		return -1;
	}

}
