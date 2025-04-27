package com.array.finalarray;

public class ReferArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int[] arr= {1,2,3,4};
		final int[] arr1= {11,22,33,44};
		//arr=arr1;
		//arr1=arr;
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}

}
