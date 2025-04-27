package com.inheritance.main;

class Test{
	int a=10;
}
public class Main extends Test{
	int b=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		System.out.println(m.a);
		System.out.println(m.b);
	}

}
