package com.problem.main;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=1;
		int n=5;
		if(n==0) {
			ans=1;
			System.out.println(ans);
		}
		for(int i=n;i<=1;i++) {
			ans*=i;
		}
		System.out.println(ans);
	}

}
