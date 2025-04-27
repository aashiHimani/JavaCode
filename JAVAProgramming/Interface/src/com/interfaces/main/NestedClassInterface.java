package com.interfaces.main;

class Test{
	interface Aa{
		void show();
	}
}
class Testing implements Test.Aa{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("nested class iterface");
	}
}
public class NestedClassInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test.Aa obj;
		Testing t=new Testing();
		obj=t;
		obj.show();
	}

}
