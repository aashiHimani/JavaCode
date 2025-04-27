package com.oops;

import java.util.ArrayList;

class School{
	private ArrayList<Student> students;
	private ArrayList<Teachers> teachers;
	private ArrayList<SchoolClass> classes;
	public School() {
		this.students = new ArrayList<Student>();
		this.teachers = new ArrayList<Teachers>();
		this.classes = new ArrayList<SchoolClass>();
	}
	public void addStudent(Student student) {
		students.add(student);
	}
	public void removeStudent(Student student) {
		students.remove(student);
	}
	public void addTeacher(Teachers teacher) {
		teachers.add(teacher);
	}
	public void removeTeacher(Teachers teacher) {
		teachers.remove(teacher);
	}
	public void addClass(SchoolClass schoolClass) {
		classes.add(schoolClass);
	}
	public void removeClass(SchoolClass schoolClass) {
		classes.remove(schoolClass);
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public ArrayList<Teachers> getTeachers() {
		return teachers;
	}
	public ArrayList<SchoolClass> getClasses() {
		return classes;
	}
}

class Student{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
}

class Teachers{
	private String name;
	private String subject;
	public Teachers(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}

class SchoolClass{
	private String classNmae;
	private Teachers teacher;
	private ArrayList<Student> students;
	public SchoolClass(String classNmae, Teachers teacher) {
		super();
		this.classNmae = classNmae;
		this.teacher = teacher;
		this.students=new ArrayList<Student>();
	}
	public String getClassNmae() {
		return classNmae;
	}
	public void setClassNmae(String classNmae) {
		this.classNmae = classNmae;
	}
	public Teachers getTeacher() {
		return teacher;
	}
	public void setTeacher(Teachers teacher) {
		this.teacher = teacher;
	}
	public ArrayList<Student> getStudent() {
		return students;
	}
	public void addStudents(Student student) {
		students.add(student);
	}
	public void removeStudents(Student student) {
		students.remove(student);
	}
	
}
public class Example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
School school=new School();
		
		Student s=new Student("Himani",24);
		Student s1=new Student("Soumya",25);
		Student s2=new Student("Lucky",23);
		Student s3=new Student("Aashi",22);
		Student s4=new Student("Tiluwa",24);
		school.addStudent(s);
		school.addStudent(s1);
		school.addStudent(s2);
		school.addStudent(s3);
		school.addStudent(s4);
		
		Teachers t=new Teachers("Abhijit Ghosh","Math");
		Teachers t1=new Teachers("Pamini Singh","Physics");
		Teachers t2=new Teachers("Atul Roy","Chemistry");
		school.addTeacher(t);
		school.addTeacher(t1);
		school.addTeacher(t2);
		
		SchoolClass mathClass=new SchoolClass("Math",t);
		SchoolClass physicsClass=new SchoolClass("Physics",t1);
		SchoolClass ChemistryClass=new SchoolClass("Chemistry",t2);
		mathClass.addStudents(s);
		mathClass.addStudents(s1);
		mathClass.addStudents(s2);
		mathClass.addStudents(s3);
		mathClass.addStudents(s4);
		
		physicsClass.addStudents(s);
		physicsClass.addStudents(s1);
		physicsClass.addStudents(s2);
		physicsClass.addStudents(s3);
		
		ChemistryClass.addStudents(s);
		ChemistryClass.addStudents(s1);
		ChemistryClass.addStudents(s2);
		
		school.addClass(mathClass);
		school.addClass(physicsClass);
		school.addClass(ChemistryClass);
		
		System.out.println("School Information:-");
		System.out.println("Number of Students: "+school.getStudents().size());
		System.out.println("Number of Teacher: "+school.getTeachers().size());
		System.out.println("Number of Class: "+school.getClasses().size());
		System.out.println();
		
		System.out.println("Math class Information:-");
		System.out.println("class name: "+mathClass.getClassNmae());
		System.out.println("Teacher: "+mathClass.getTeacher().getName());
		System.out.println("Students: "+mathClass.getStudent().size());
		System.out.println();
		
		System.out.println("Physics Class Information:-");
		System.out.println("class name: "+physicsClass.getClassNmae());
		System.out.println("Teacher: "+physicsClass.getTeacher().getName());
		System.out.println("Students: "+physicsClass.getStudent().size());
		System.out.println();
		
		System.out.println("Chemistry Class Information:-");
		System.out.println("class name: "+ChemistryClass.getClassNmae());
		System.out.println("Teacher: "+ChemistryClass.getTeacher().getName());
		System.out.println("Students: "+ChemistryClass.getStudent().size());
		System.out.println();
		
		school.removeStudent(s);
		school.removeTeacher(t);
		school.removeClass(mathClass);
		System.out.println("School Information after removing:-");
		System.out.println("Number of Students: "+school.getStudents().size());
		System.out.println("Number of Teacher: "+school.getTeachers().size());
		System.out.println("Number of Class: "+school.getClasses().size());
		System.out.println();
	}

}
