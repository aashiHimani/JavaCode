package com.array.multidimensional;

public class Implementing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4;
		int column=4;
		int[][] arr=new int[row][column];
		int value=1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				//arr[i][j]=(i+1)*(j+1);
				arr[i][j]=value;
				value++;
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
