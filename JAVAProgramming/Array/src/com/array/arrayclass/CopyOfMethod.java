package com.array.arrayclass;

import java.util.Arrays;

public class CopyOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {89,54,83,25,73};
		System.out.println("copy of array:"+Arrays.toString(Arrays.copyOf(arr, 8)));
		//Copies the specified array, truncating or padding with the default value (if necessary) so the copy has the specified length.
		System.out.println("copy of array:"+Arrays.toString(Arrays.copyOfRange(arr, 2, 7)));
		//Copies the specified range of the specified array into a new Arrays.
	}

}
