package com.array.practice;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {78,94,45,87,90,92};
		int largest=arr[0],secondLargest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=largest && arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		System.out.println(largest);			
		System.out.println(secondLargest);	
	}

}
