package com.string.practice;

public class LongestRepeatingSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefghybcd";
		String lrs="";
		int n=s.length();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				String str=lcp(s.substring(i,n),s.substring(j,n));
				if(str.length()>lrs.length())
					lrs=str;
			}
		}
		System.out.println(lrs);
	}

	public static String lcp(String s, String t) {
		// TODO Auto-generated method stub
		int n=Math.min(s.length(),t.length());
		for(int i=0;i<n;i++) {
			if(s.charAt(i)!=t.charAt(i)) {
					return s.substring(0,i);
			}
		}
		return s.substring(0,n);
	}

}
