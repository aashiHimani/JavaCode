package com.string.practice;

public class DublicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Big black bug bit a big black dog on his big black nose";
		int count;
		s=s.toLowerCase();
		String words[]=s.split(" ");  
		for(int i=0;i<words.length;i++) {
			count =1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]="0";
				}
			}
			if(count>1 && words[i]!="0") {
				System.out.println(words[i]);
			}
		}	
	}

}
