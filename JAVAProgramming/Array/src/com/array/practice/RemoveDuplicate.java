package com.array.practice;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,70,30,90,20,20,30,40,70,50};
		int n=arr.length;
		if(n==0||n==1) {
			System.out.println(arr[n]);
		}
		int j=0;
		//1st approach
		/*
		int temp[]=new int[n];
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		for(int i=0;i<n;i++) {
			arr[i]=temp[i];
		}
		*/
		
		//2nd approach
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[n-1];
		
		//print
		for(int i=0;i<j;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
