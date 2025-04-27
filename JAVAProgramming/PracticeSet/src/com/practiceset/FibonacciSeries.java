package com.practiceset;

public class FibonacciSeries {
	static int a=0,b=1,c;
	static void fibo(int num) {
		if(num>0) {
			c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
			fibo(num-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,i,num=10;
		System.out.print(n1+","+n2);
		/*for(i=2;i<num;i++) {
			n3=n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;
		}
		*/
		fibo(num-2);
	}

}
