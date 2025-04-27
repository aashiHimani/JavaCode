package com.array.main;

public class CloningMultidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{4,9,2},{7,3,1},{5,9,3}};
		int[][] cloneArr=arr.clone();
		System.out.println(arr==cloneArr);
		for(int i=0;i<cloneArr.length;i++) {
			for(int j=0;j<cloneArr.length;j++) {
				System.out.print(cloneArr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(arr[0]==cloneArr[0]);
		System.out.println(arr[1]==cloneArr[1]);
	}

}
