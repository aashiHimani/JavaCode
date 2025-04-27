package com.string.practice;

public class LargestAndSmallestPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="wow you buy Kayak";
		s=s.toLowerCase();
		s=s+" ";
		String word="",smallp="",largep="";
		String[] w=new String[256];
		int temp=0, count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				word+=s.charAt(i);
			}
			else {
				w[temp]=word;
				temp++;
				word=" ";
			}
		}
		for(int i=0;i<temp;i++) {
			if(isPallindrime(w[i])) {
				count++;
			}
			if(count==1) {
				smallp=largep=w[i];
			}
			if(smallp.length()>w[i].length()) {
				smallp=w[i];
			}
			if(largep.length()>w[i].length()) {
				largep=w[i];
			}
		}
		if(count==0) {
			System.out.println("no pallindrome");
		}
		else {
			System.out.println("small pallindrome:"+smallp);
			System.out.println("large pallindrome:"+ largep);
		}
	}

	private static boolean isPallindrime(String string) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)!=string.charAt(string.length()-i-1)) {
				flag=false;
				break;
			}
		}
		return flag;
	}
}
