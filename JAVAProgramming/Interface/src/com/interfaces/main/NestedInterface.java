package com.interfaces.main;

interface Ab{
	interface Xy{
		void show();
	}
}
class Abc implements Ab.Xy{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("nested  iterface");
	}
}
public class NestedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ab.Xy obj;
		Abc t=new Abc();
		obj=t;
		obj.show();
	}

}
