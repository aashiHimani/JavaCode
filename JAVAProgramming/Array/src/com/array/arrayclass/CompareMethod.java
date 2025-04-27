package com.array.arrayclass;

import java.util.Arrays;

public class CompareMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Compares two arrays passed as parameters lexicographically.
		int arr[] = { 10, 20, 15, 22, 35 };  
        int arr1[] = { 10, 15, 22 }; 
        System.out.println("Arrays on comparison: "+ Arrays.compare(arr, arr1));
        System.out.println("Arrays on comparison: "+ Arrays.compareUnsigned(arr, arr1));
	}

}
