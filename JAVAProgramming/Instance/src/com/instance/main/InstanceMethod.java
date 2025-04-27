package com.instance.main;

class A{
	String name="";
	public void show(String name) {
		this.name=name;
	}
}
public class InstanceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.show("himu");
		System.out.println(a.name);
	}

}
