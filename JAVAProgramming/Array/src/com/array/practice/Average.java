package com.array.practice;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40};
		int ans=0;
		for(int i=0;i<a.length;i++) {
			ans+=a[i];
		}
		System.out.println(ans/a.length);
	}

}
