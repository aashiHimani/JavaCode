package com.search.main;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,7,9,3,8,2,6};
		int key=8;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println(key+" element is present at "+i+" index");
			}
		}
	}

}
