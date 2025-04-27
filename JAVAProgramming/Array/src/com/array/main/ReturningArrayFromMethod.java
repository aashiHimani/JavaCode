package com.array.main;

public class ReturningArrayFromMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=m();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private static int[] m() {
		// TODO Auto-generated method stub
		return new int[] {6,9,4,2};
	}

}
