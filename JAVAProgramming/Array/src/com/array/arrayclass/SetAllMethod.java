package com.array.arrayclass;

import java.util.Arrays;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class SetAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sets all the elements of the specified array using the generator function provided. 
		Person p[]= {new Person("somu",24),new Person("himu",23),new Person("aashi",25),new Person("chimpu",22)};
		Arrays.setAll(p, e->{
			if(p[e].age<24) {
				return new Person("too young",p[e].age);
			}
			else {
				return new Person(p[e].name,p[e].age);
			}
		});
		Arrays.stream(p).forEach(e->System.out.println(e.name+" "+e.age));
	}

}
