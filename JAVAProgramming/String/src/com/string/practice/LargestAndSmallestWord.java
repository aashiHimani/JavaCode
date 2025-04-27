package com.string.practice;

public class LargestAndSmallestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hardships often prepare ordinary people for an extraordinary destiny";
		String small="",large="", word="";
		String[] w=new String[100];
		int length=0;
		s=s+" ";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				word+=s.charAt(i);
			}
			else {
				w[length]=word;
				length++;
				word="";
			}
		}
		small=large=w[0];
		for(int i=0;i<length;i++) {
			if(small.length()>w[i].length()) {
				small=w[i];
			}
			if(large.length()<w[i].length()){
				large=w[i];
			}
		}
		System.out.println("smallest word:"+small);
		System.out.println("largest word:"+large);
	}

}
