package com.array.main;

class Student{
	int rollNo;
	String name;
	Student(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	Student(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}
public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr=new Student[4];
		arr[0]=new Student(1,"himu");
		arr[1]=new Student(2,"somu");
		arr[2]=new Student(3,"chimpu");
		arr[3]=new Student(4,"chotu");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("element at index "+i+" is:"+arr[i].rollNo+" "+arr[i].name);
		}
		
		Student[] arr1=new Student[]{new Student("himu"),new Student("somu"),new Student("chimpu")};
		for(Student s:arr1) {
			System.out.println(s);
		}
	}

}
