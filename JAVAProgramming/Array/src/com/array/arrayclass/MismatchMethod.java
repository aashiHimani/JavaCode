package com.array.arrayclass;

import java.util.Arrays;

public class MismatchMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Finds and returns the index of the first unmatched element between the two specified arrays.
		int arr[]= {3,8,1,5,7};
		int arr1[]= {3,1,5};
		System.out.println("deep equals method:"+Arrays.mismatch(arr, arr1));
	}

}
