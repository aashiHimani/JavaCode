package com.array.multidimensional;

import java.util.Arrays;

public class Practice {
	
	static boolean foo(char c) {
		System.out.print(c);
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		for(foo('A');foo('B')&&(i<2);foo('C')) {
			i++;
			foo('D');
		}
		//System.out.println(sum);
	}

}
