package com.string.main;

import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("Hi my name is himu"," ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		StringTokenizer st1=new StringTokenizer("Hi,my,name,is,himu");
		System.out.println("Next token is :"+st1.nextToken(","));
		StringTokenizer st2=new StringTokenizer("Hi my name is himu"," ");
		System.out.println(st2.countTokens());
	}

}
