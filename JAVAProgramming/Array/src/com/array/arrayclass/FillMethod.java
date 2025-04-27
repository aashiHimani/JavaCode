package com.array.arrayclass;

import java.util.Arrays;

public class FillMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assigns this fill value to each index of this arrays.
		int arr[]= {3,8,1,5,7};
		int key=4;
		Arrays.fill(arr, key);
		System.out.println("deep equals method:"+Arrays.toString(arr));
		//It returns a string representation of the contents of this array. 
		//The string representation consists of a list of the array’s elements, enclosed in 
		//square brackets (“[]”). Adjacent elements are separated by the characters a comma 
		//followed by a space. Elements are converted to strings as by String.valueOf() function.
	}

}
