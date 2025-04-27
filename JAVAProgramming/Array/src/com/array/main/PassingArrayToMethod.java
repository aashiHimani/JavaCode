package com.array.main;

public class PassingArrayToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,8,7,1,9};
		sum(arr);
	}

	private static void sum(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
