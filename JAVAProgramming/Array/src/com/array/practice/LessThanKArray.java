package com.array.practice;

public class LessThanKArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {54,43,2,5,14,17,18,19};
		int k=15;
		int ans[]=lessThanK(a,k);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}

	private static int[] lessThanK(int[] a, int k) {
		// TODO Auto-generated method stub
		int s=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<k) {
				s++;
			}
		}
		int store[]=new int[s];
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<k) {
				store[index]=a[i];
				index++;
			}
		}
		return store;
	}

	

}
