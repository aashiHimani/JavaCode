package com.string.main;

class Employees{
	int id;
	String name;
	int age;
	public Employees(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
public class WithoutToStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e1=new Employees(101,"Himu",24);
		Employees e2=new Employees(102,"Somu",25);
		System.out.println(e1);
		System.out.println(e2);
	}

}
