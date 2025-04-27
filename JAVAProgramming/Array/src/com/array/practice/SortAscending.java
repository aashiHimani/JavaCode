package com.array.practice;

public class SortAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {33,21,54,87,34,16,47};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
