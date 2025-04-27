package com.interfaces.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int rollNo;
	String name, adress;
	public Student(int rollNo, String name, String adress) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", adress=" + adress + "]";
	}
}
class SortByRoll implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollNo- o2.rollNo;
	}
}
class SortByName implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}
public class ComparatorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> ar=new ArrayList<Student>();
		ar.add(new Student(111,"himu","munger"));
		ar.add(new Student(222,"somu","puri"));
		ar.add(new Student(333,"lucky","bhubneswar"));
		ar.add(new Student(444,"aashi","patna"));
		ar.add(new Student(555,"chimpu","blr"));
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		Collections.sort(ar,new SortByRoll());
		System.out.println("sort by roll no");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		Collections.sort(ar,new SortByName());
		System.out.println("sort by name");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}

}
