package com.array.practice;

public class CopyElementOfOneToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,89,76,45,86,21};
		int[] anotherArr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			anotherArr[i]=arr[i];
		}
		System.out.println("display arr1:-");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("/n display arr2:-");
		for(int i=0;i<anotherArr.length;i++) {
			System.out.print(anotherArr[i]+" ");
		}
	}

}
