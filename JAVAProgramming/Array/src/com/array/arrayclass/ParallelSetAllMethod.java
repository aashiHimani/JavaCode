package com.array.arrayclass;

import java.util.Arrays;

class Person1{
	String name;
	int age;
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + "]";
	}
	
}
public class ParallelSetAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Sets all the elements of this array in parallel, using the provided generator function. 
		Person1 obj[]= {new Person1("somu",24),new Person1("himu",23),new Person1("aashi",25),new Person1("soumya",22)};
		Arrays.parallelSetAll(obj, e->{
			if(obj[e].name.startsWith("s")) {
				return new Person1("lucky",100);
			}
			else {
				return new Person1(obj[e].name,obj[e].age);
			}
		});
		Arrays.stream(obj).forEach(e->System.out.println(e.name+" "+e.age));
	}

}
