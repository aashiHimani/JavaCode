package com.string.comparison;

import java.util.ArrayList;
import java.util.List;

public class UsingEqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Himu";
		String s1="Himu";
		String s2=new String("Himu");
		String s3="Somu";
		String s4="HIMU";
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		System.out.println(s.equals(s4));
		System.out.println(s.equalsIgnoreCase(s4));
		
		List<String> list=new ArrayList<String>();
		list.add("himu");
		list.add("somu");
		list.add("chimpu");
		for(String str:list) {
			if(str.contains("himu")) {
				System.out.println("himu is present");
			}
		}
		
		String ss="a";
		String ss1="12";
		String ss2="12.23";
		String ss3="true";
		Character c=new Character('a');
		Integer i=new Integer(12);
		Float f=new Float(12.23f);
		Boolean b=new Boolean(true);
		System.out.println(ss.equals(c));
		System.out.println(ss1.equals(i));
		System.out.println(ss2.equals(f));
		System.out.println(ss3.equals(b));
		
		System.out.println(ss.equals(c.toString()));
		System.out.println(ss1.equals(i.toString()));
		System.out.println(ss2.equals(f.toString()));
		System.out.println(ss3.equals(b.toString()));
	}

}
