package com.array.practice;

public class CountDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,10,20,30};
		int count=0;
		for(int i=0;i<a.length;i++) {
			boolean isSame=true;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					isSame=false;
					break;
				}
			}
			if(isSame) {
				count++;
			}
		}
		System.out.println(count);
	}

}
