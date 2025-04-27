package com.array.arrayclass;

import java.util.Arrays;

public class DeepEqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{3,8,1,5,7}};
		int arr1[][]= {{3,1,5}};
		System.out.println("deep equals method:"+Arrays.deepEquals(arr, arr1));
		//Returns true if the two specified arrays are deeply equal to one another.
	}

}
