package com.interfaces.main;

interface Ab1{
	protected interface Xyz{
		void show();
	}
}
class Abc1 implements Ab1.Xyz{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("nested  iterface");
	}
}
public class NestedProtectedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ab1.Xyz obj;
		Abc1 t=new Abc1();
		obj=t;
		obj.show();
	}

}
