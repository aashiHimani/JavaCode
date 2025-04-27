package com.array.multidimensional;

import java.util.Scanner;

public class DistinctCountInAllRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter N: ");
//		int n=sc.nextInt();
//		int[][] m=new int[n][n];
//		for(int i=0;i<=n;i++) {
//			for(int j=0;j<=n;j++) {
//				System.out.println("Enter value: ");
//			}
//		} 
		int n=4;
		int m[][]= {{2,1,4,3},
					{1,2,3,2},
					{3,6,2,3},
					{5,2,5,3}};
		int ans=distinct(m,n);
		System.out.println(ans);
	}

	private static int distinct(int m[][], int n) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<m[0].length;i++) {
			int element=m[0][i];
			boolean allRow=true;
			for(int j=0;j<m.length;j++) {
				boolean currentRow=false;
				for(int k=0;k<m[i].length;k++) {
					if(m[j][k]==element) {
						currentRow=true;
						break;
					}
				}
				if(!currentRow) {
					allRow=false;
					break;
				}
			}
			if(allRow) {
				count++;
			}
		}
		return count;
	}

}
