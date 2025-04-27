package com.array.arrayclass;

import java.util.Arrays;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Checks if both the arrays are equal or not.
		int arr[][]= {{3,8,1,5,7}};
		int arr1[][]= {{3,1,5}};
		System.out.println("deep equals method:"+Arrays.equals(arr, arr1));
	}

}
