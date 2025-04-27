package com.array.arrayclass;

import java.util.Arrays;

public class StreamMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Returns a sequential stream with the specified array as its source.
		int arr[]= {5,8,3,9,2,4};
		System.out.println("Spliterator:"+Arrays.stream(arr));

	}

}
