package com.array.arrayclass;

import java.util.Arrays;
import java.util.Comparator;

class Student{
	int rollNo;
	String name;
	String address;
	public Student(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}
}
class SortBy implements Comparator<Student>{
	public int compare(Student a, Student b) {
		return a.rollNo-b.rollNo;
	}
}
public class SortMethod1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student []s= {new Student(3,"himu","Bhubneswar"),new Student(1,"somu","puri"),new Student(2,"Krishna","Vrindavan")};
		System.out.println("unsorted:");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		Arrays.sort(s, 1, 2, new SortBy());
		System.out.println("sorted:");
		//Sorts the specified range of the specified array of objects according to the order induced by the specified comparator.
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		//Sorts the specified array of objects according to the order induced by the specified comparator.
		System.out.println("another sorted:");
		Arrays.sort(s,new SortBy());
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
