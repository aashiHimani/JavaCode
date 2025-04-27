package com.polymorphism.main;

class A{
	void m1() {
		System.out.println("a1");
	}
}
class B extends A{
	void m1() {
		System.out.println("b1");
	}
}
class C extends A{
	void m1() {
		System.out.println("c1");
	}
}
public class DynamicMethodDespatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		B b=new B();
		C c=new C();
		A ref;
		ref=a;
		ref.m1();
		ref=b;
		ref.m1();
		ref=c;
		ref.m1();
	}

}
