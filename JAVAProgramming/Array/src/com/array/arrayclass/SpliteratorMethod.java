package com.array.arrayclass;

import java.util.Arrays;

public class SpliteratorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Returns a Spliterator covering all of the specified Arrays.
		int[] arr= {7,2,9,4,8,1,6};
		System.out.println("Spliterator:"+Arrays.spliterator(arr));
//Returns a Spliterator of the type of the array covering the specified range of the specified arrays.
		System.out.println("Spliterator:"+Arrays.spliterator(arr, 1, 3));
	}

}
