package com.sorting.main;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,3,9,6,2,1,5};
		for(int i=0;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while((j>-1)&&(arr[j]>key)) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
