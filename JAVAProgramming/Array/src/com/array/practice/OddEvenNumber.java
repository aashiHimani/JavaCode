package com.array.practice;

public class OddEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,8,3,9,7,2,4};
		System.out.print("even no:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		System.out.print("odd no:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}

}
