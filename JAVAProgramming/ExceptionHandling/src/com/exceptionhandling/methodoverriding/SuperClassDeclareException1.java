package com.exceptionhandling.methodoverriding;

//subclass overridden method declares same exception
class Parenta{
	void show() throws Exception{
		System.out.println("parent method");
	}
}
public class SuperClassDeclareException1 extends Parenta{
	void show() throws Exception{
		System.out.println("child method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parenta p=new SuperClassDeclareException1();
		try {
			p.show();
		}
		catch(Exception e) {
			e.getMessage();
		}
	}

}
