package com.string.method;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hi my name is himani";
		String[] str=s.split("\\s");
		for(String w:str) {
			System.out.println(w);
		}
		
		System.out.println("------");
		for(String w:s.split("\\s",0)) {
			System.out.println(w);
		}
		
		System.out.println("------");
		for(String w:s.split("\\s",1)) {
			System.out.println(w);
		}
		
		System.out.println("------");
		for(String w:s.split("\\s",2)) {
			System.out.println(w);
		}
		
		String ss="himusomuuu";
		System.out.println("------");
		String[] qw=s.split("u",0);
		for(String w:qw) {
			System.out.println(w);
		}
		System.out.println("split array length:"+qw.length);
	}

}
