package com.string.practice;

public class FrequencyOfAllCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="perfectpicture";
		int[] freq=new int[256];
		for(int i=0;i<s.length();i++) {
			freq[(int) s.charAt(i)]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=0) {
				System.out.println((char) i+"="+freq[i]);
			}
		}
	}

}
