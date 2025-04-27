package com.string.practice;

public class SecondFrequentCharacter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ababcbbacab";
		char res=frequent(str);
		if(res!='\0') {
			System.out.println("second character:"+res);
		}
		else {
			System.out.println("second character is not present");
		}
	}

	private static char frequent(String str) {
		// TODO Auto-generated method stub
		int[] arr=new int[256];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]++;
		}
		int first=0,second=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[first]) {
				second=first;
				first=i;
			}
			else if(arr[i]>arr[second]&& arr[i]!=arr[first]) {
				arr[second]=i;
			}
		}
		return (char) second;
	}

}
