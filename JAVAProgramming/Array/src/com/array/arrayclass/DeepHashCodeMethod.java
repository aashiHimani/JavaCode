package com.array.arrayclass;

import java.util.Arrays;

public class DeepHashCodeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{4,9,7,2,5}};
		System.out.println("deep hash code:"+Arrays.deepHashCode(arr));
		//Returns a hash code based on the “deep contents” of the specified Arrays.
	}

}
