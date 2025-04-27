package com.array.arrayclass;

import java.util.Arrays;

class Person2{
	String name;
	int age;
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + "]";
	}
	
}
public class ParallelPrefixMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p[]= {new Person2("somu",24),new Person2("himu",23),new Person2("aashi",25),new Person2("chimpu",22)};
		Arrays.parallelPrefix(p, (e1, e2) ->new Person2(e1.name.toUpperCase().concat(e2.name),e1.age + e2.age));
		Arrays.stream(p).forEach(e -> System.out.println(e.name + "   " + e.age));
		//Performs parallelPrefix for the given range of the array with the specified functional operator.
		Arrays.parallelPrefix(p, 1, 4, (e1, e2) ->new Person2(e1.name.toUpperCase().concat(e2.name),e1.age + e2.age));
		Arrays.stream(p).forEach(e -> System.out.println(e.name + "   " + e.age));
		//Performs parallelPrefix for complete array with the specified functional operator. 
	}

}
