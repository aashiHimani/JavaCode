package com.exceptionhandling.methodoverriding;

//subclass overridden method declares no exception
class Parentc{
	void show() throws Exception{
		System.out.println("parent method");
	}
}
public class SuperClassDeclareException3 extends Parentc{
	void show(){
		System.out.println("child method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentc p=new SuperClassDeclareException3();
		try {
			p.show();
		}
		catch(Exception e) {
			e.getMessage();
		}
	}

}
