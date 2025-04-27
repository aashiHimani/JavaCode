package com.interfaces.main;

class Test1{
	protected interface Aaa{
		void show();
	}
}
class Testing1 implements Test1.Aaa{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("nested class iterface");
	}
}
public class NestedClassWithProtectedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1.Aaa obj;
		Testing1 t=new Testing1();
		obj=t;
		obj.show();
	}

}
