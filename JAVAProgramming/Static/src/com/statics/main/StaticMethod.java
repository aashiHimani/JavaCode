package com.statics.main;

class A{
	public static String name="";
	public static void show(String name) {
		name=name;
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.name="himu";
		System.out.println(A.name);
	}	

}
