package com.oops;

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("Himani",24);
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}

}
