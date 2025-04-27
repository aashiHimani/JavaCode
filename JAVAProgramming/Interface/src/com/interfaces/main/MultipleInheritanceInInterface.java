package com.interfaces.main;

interface A{
	default void show() {
		System.out.println("default a");
	}
}
interface B{
	default void show() {
		System.out.println("default b");
	}
}
public class MultipleInheritanceInInterface implements A,B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceInInterface o=new MultipleInheritanceInInterface();
		o.show();
		o.showOfA();
		o.showOfB();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		A.super.show();
		B.super.show();
	}
	public void showOfA() {
		A.super.show();
	}
	public void showOfB() {
		B.super.show();
	}

}
