package com.search.main;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 4, 5, 6, 7, 8};
		int key=3;
		int n=arr.length;
		int first=0,last=n-1;	
		int res=search(arr,first,last,key);
		if(res==-1) {
			System.out.println("element is not found");
		}
		else {
			System.out.println(" element is found at "+ res);
		}
	}

	private static int search(int[] arr, int first, int last, int key) {
		// TODO Auto-generated method stub
		int mid=(first+last)/2;
		while(first<=last) {
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key) {
				return search(arr,mid+1,last,key);
			}
			else {
				return search(arr,first,mid-1,key);
			}
		}
		return -1;
	}

}
