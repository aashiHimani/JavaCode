package com.array.practice;

public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,8,4,3,8,4,2,6,5,2};
		int[] fre=new int[arr.length];
		int visited=-1;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					fre[j]=visited;
				}
			}
			if(fre[i]!=visited) {
				fre[i]=count;
			}
		}
		for(int i=0;i<fre.length;i++) {
			if(fre[i]!=visited) {
				System.out.println(arr[i]+" = "+fre[i]);
			}
		}
	}
}
