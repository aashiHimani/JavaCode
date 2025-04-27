package com.oops;

import java.util.ArrayList;

class Students{
	private String name;
	private int grade;
	private ArrayList<String> courses;
	public Students(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
		this.courses=new ArrayList<String>();
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public ArrayList<String> getCourses() {
		return courses;
	}
	public void addCourse(String course) {
		courses.add(course);
	}
	public void removeCourse(String course) {
		courses.remove(course);
	}
	public void getStudets() {
		System.out.println("Name: "+name+" grade is: "+grade);
	}
}

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students("Himani",10);
		Students s1=new Students("Soumya",12);
		Students s2=new Students("Lucky",11);
		System.out.println("Students details is:" );
		s.getStudets();
		s1.getStudets();
		s2.getStudets();
		
		System.out.println("\n"+"Adding course for "+s.getName());
		s.addCourse("Math");
		s.addCourse("Science");
		s.addCourse("English");
		s.addCourse("Hindi");
		s.addCourse("Computer");
		System.out.println(s.getName()+" 's courses is: "+s.getCourses()+"\n");
		
		System.out.println("Adding course for "+s1.getName());
		s1.addCourse("Math");
		s1.addCourse("Physics");
		s1.addCourse("Chemistry");
		System.out.println(s1.getName()+" 's courses is: "+s1.getCourses()+"\n");
		
		System.out.println("Adding course for "+s2.getName());
		s2.addCourse("Math");
		s2.addCourse("Biology");
		s2.addCourse("Physical Education");
		s2.addCourse("Accounting");
		System.out.println(s2.getName()+" 's courses is: "+s2.getCourses());
	}

}
