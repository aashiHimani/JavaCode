package com.inheritance.main;

import java.util.ArrayList;
import java.util.List;

class Student{
	String name;
	int id;
	String department;
	public Student(String name, int id, String department) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
	}
}

class Department{
	String name;
	private List<Student> students;
	public Department(String name, List<Student> students) {
		super();
		this.name = name;
		this.students = students;
	}
	public List<Student> getStudents() {
		return students;
	}
}

class Institute{
	String instituteName;
	private List<Department> dept;
	public Institute(String instituteName, List<Department> dept) {
		super();
		this.instituteName = instituteName;
		this.dept = dept;
	}
	public int getTotalNoOfStudents() {
		int noOfStudents=0;
		List<Student> stud;
		for(Department d:dept) {
			stud=d.getStudents();
			for(Student s:stud) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
}
public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("himu",1,"CSE");
		Student s2=new Student("somu",2,"CSE");
		Student s3=new Student("chimpu",3,"EEE");
		Student s4=new Student("lucky",4,"CSE");
		Student s5=new Student("ranjan",5,"EEE");
		
		List<Student> csest=new ArrayList<>();
		csest.add(s1);
		csest.add(s2);
		List<Student> eeest=new ArrayList<>();
		eeest.add(s3);
		eeest.add(s5);
		Department cse=new Department("CSE",csest);
		Department eee=new Department("EEE",eeest);
		List<Department> d=new ArrayList<>();
		d.add(cse);
		d.add(eee);
		Institute i=new Institute("HOGWARD",d);
		System.out.println(i.getTotalNoOfStudents());
	}

}
