package com.array.arrayclass;

import java.util.Arrays;

public class BinarySearchMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {65,89,32,86,33};
		Arrays.sort(arr);
		int key=86;
		System.out.println(key+" found at "+Arrays.binarySearch(arr, key));
		//Searches for the specified element in the array with the help of the Binary Search Algorithm
		System.out.println(key+" found at "+Arrays.binarySearch(arr, 1, 3, key));
		//Searches a range of the specified array for the specified object using the Binary Search Algorithm
	}

}
