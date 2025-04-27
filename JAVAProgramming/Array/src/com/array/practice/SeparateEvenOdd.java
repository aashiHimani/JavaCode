package com.array.practice;

public class SeparateEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {54,43,2,5,14,17,18,19};
		int ans[]=evenOdd(a);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}

	private static int[] evenOdd(int[] a) {
		// TODO Auto-generated method stub
		int e=0,o=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				e++;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				o++;
			}
		}
		
		int even[]=new int[e];
		int odd[]=new int[o];
		int index=0,index1=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[index]=a[i];
				index++;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				odd[index1]=a[i];
				index1++;
			}
		}
		int len=e+o;
		int[] combine=new int[len];
		for(int i=0;i<e;i++) {
			combine[i]=even[i];
		}
		for(int i=0;i<o;i++) {
			combine[e+i]=odd[i];
		}
		return combine;
	}
}
