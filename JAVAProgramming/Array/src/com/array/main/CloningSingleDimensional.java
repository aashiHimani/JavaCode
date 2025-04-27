package com.array.main;

public class CloningSingleDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,8,2,9,1};
		int cloneArr[]=arr.clone();
		System.out.println(arr==cloneArr);
		for(int i=0;i<cloneArr.length;i++) {
			System.out.print(cloneArr[i]+" ");
		}
		
	}

}
