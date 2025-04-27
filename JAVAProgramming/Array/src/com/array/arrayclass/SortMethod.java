package com.array.arrayclass;

import java.util.Arrays;

public class SortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {8,4,3,9,2,5,1};
		Arrays.sort(arr);
		//Sorts the complete array in ascending order. 
		System.out.println("sort array:"+Arrays.toString(arr));
		int []arr1= { 10, 20, 15, 22, 35 };
		Arrays.sort(arr1, 1, 3);
		//Sorts the specified range of array in ascending order.
		System.out.println("sort array in range:"+Arrays.toString(arr1));
		
			}

}
