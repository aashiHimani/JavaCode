package com.polymorphism.main;

class Ab{
	public int show(int a) {
		return 10;
	}
	public char show(int a,int b) {
		return 'a';
	}
}
public class OverloadingWithReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ab a=new Ab();
		System.out.println(a.show(1));
		System.out.println(a.show(1,2));
	}

}
