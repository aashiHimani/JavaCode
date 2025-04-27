package com.pattern.main;

public class SqaureSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || i==1 || i==n || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || i==1 || i==n || j==n) {
					System.out.print("* ");
				}
				else if(i>1 && i<n && j>1 && j<n) {
					System.out.print("  ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
	}

}
