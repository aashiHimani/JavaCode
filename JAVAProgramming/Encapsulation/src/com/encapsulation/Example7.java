package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

class Student{
	private int student_id;
	private String student_name;
	private List<Double> grades;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public List<Double> getGrades(){
		return grades;
	} 
	public void addGrades(double grade) {
		if(grades==null) {
			grades=new ArrayList<>();
		}
		grades.add(grade);
	}
}
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setStudent_id(123);
		s.setStudent_name("Himani");
		s.addGrades(98.0);
		s.addGrades(96.07);
		System.out.println("Student id is:"+s.getStudent_id()+" student name is: "+s.getStudent_name()+" student grades is: "+s.getGrades());
	
	}

}
