package com.array.main;

public class ImplementationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		arr=new int[5];
		arr[0]=5;
		arr[1]=8;
		arr[2]=9;
		arr[3]=6;
		arr[4]=1;
		for(int i=0;i<arr.length;i++) {
			System.out.println("element at index "+i+" is:"+arr[i]);
		}
		System.out.println("length of array is:"+arr.length);
	}

}
