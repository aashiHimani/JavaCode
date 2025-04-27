package com.string.main;

class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
public class WithToStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student e1=new Student(101,"Himu",24);
		Student e2=new Student(102,"Somu",25);
		System.out.println(e1);
		System.out.println(e2);
	}

}
