package com.string.practice;

public class LongestPallindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "forgeeksskeegfor";
		System.out.println(str);
		System.out.print("\nlongest palindromic substring is:"+longPal(str));
	}

	private static int longPal(String str) {
		// TODO Auto-generated method stub
		int maxLength=1;
		int start=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				int flag=1;
				for(int k=0;k<(j-i+1)/2;k++) {
					if(str.charAt(i+k)!=str.charAt(j-k)) {
						flag=0;
					}
					if(flag!=0 && (j-i+1)>maxLength) {
						start=i;
						maxLength=j-i+1;
					}
				}
			}
		}
		System.out.println("longest pallindrome is: ");
		printRes(str,start,start+maxLength-1);	
		return maxLength;
	}

	private static void printRes(String str, int start, int end) {
		// TODO Auto-generated method stub
		for(int i=start;i<=end;i++) {
			System.out.print(str.charAt(i));
		}
		
	}

}
