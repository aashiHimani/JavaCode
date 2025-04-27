package com.array.practice;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {78,94,45,87,90,92};
		int smallest = arr[0], secondSmallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=smallest && arr[i]<secondSmallest) {
				secondSmallest=arr[i];
			}
		}
		System.out.println(secondSmallest);
	}

}
