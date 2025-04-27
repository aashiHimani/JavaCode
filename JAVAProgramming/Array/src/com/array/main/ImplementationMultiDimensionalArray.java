package com.array.main;

public class ImplementationMultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[3][3];
		System.out.println("number of rows:"+arr.length);
		System.out.println("number of columns:"+arr[0].length);
		
		int[][] arr1= {{3,7,8},{5,9,1},{9,4,2}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
