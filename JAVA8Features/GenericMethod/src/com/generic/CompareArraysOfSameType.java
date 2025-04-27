package com.generic;

import java.util.Arrays;

public class CompareArraysOfSameType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1= {2,5,8,7};
		Integer[] arr2= {0,3,6,1};
		Integer[] arr3= {2,5,8,7};
		String[] arr4= {"hi","hello","bye"};
		System.out.println("Array one is:"+Arrays.toString(arr1));
		System.out.println("Array two is:"+Arrays.toString(arr2));
		System.out.println("Array three is:"+Arrays.toString(arr3));
		System.out.println("Array four is:"+Arrays.toString(arr4));
		System.out.println("Compare arr1 and arr2 :"+CompareArray(arr1,arr2));
		System.out.println("Compare arr2 and arr3 :"+CompareArray(arr2,arr3));
		System.out.println("Compare arr1 and arr3 :"+CompareArray(arr1,arr3));
		System.out.println("Compare arr1 and arr4 :"+CompareArray(arr1,arr4));
		System.out.println("Compare arr2 and arr4 :"+CompareArray(arr2,arr4));
		System.out.println("Compare arr3 and arr4 :"+CompareArray(arr3,arr4));
	}

	private static <T> boolean CompareArray(T[] arr1, T[] arr2) {
		// TODO Auto-generated method stub
		if(arr1.length!=arr2.length) {
			return false;
		}
		for(int i=0;i<arr1.length;i++) {
			if(!arr1[i].equals(arr2[i])) {
				return false;
			}
		}
		return true;
	}

}
