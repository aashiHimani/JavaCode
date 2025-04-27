package com.array.arrayclass;

import java.util.Arrays;

public class ParallelSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,4,7,3,0,5,1};
		Arrays.parallelSort(arr);
		System.out.println("parallel sort: "+Arrays.toString(arr));
		//Sorts the specified array using parallel sort.
	}

}
