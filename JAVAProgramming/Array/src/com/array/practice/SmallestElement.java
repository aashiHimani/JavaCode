package com.array.practice;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {78,94,45,87,90,92};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
