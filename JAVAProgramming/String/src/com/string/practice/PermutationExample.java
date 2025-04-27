package com.string.practice;

public class PermutationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="PQR";
		int n=s.length();
		System.out.println("permutations are:");
		generatePermutation(s,0,n);
	}

	private static void generatePermutation(String s, int start, int end) {
		// TODO Auto-generated method stub
		if(start==end-1) {
			System.out.println(s);
		}
		else {
			for(int i=start;i<end;i++) {
				s=swap(s,start,i);
				generatePermutation(s,start+1,end);
				s=swap(s,start,i);
			}
				
		}
	}

	private static String swap(String s, int start, int i) {
		// TODO Auto-generated method stub
		char[] ch=s.toCharArray();
		char c;
		c=ch[start];
		ch[start]=ch[i];
		ch[i]=c;
		return String.valueOf(ch);
	}

}
