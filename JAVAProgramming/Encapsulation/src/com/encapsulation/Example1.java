package com.encapsulation;

class Person{
	private String name;
	private int age;
	private String country;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.setName("himani");
		p.setAge(24);
		p.setCountry("India");
		System.out.println("name: "+p.getName()+" age: "+p.getAge()+" country: "+p.getCountry());
	}

}
