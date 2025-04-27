package com.inheritance;

class Person{
	String firstName;
	String lastName;
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}

class Employee1 extends Person{
	int EmployeeId;
	String jobTitle;
	public Employee1(String firstName, String lastName, int employeeId, String jobTitle) {
		super(firstName, lastName);
		EmployeeId = employeeId;
		this.jobTitle = jobTitle;
	}
	public int getEmployeeID() {
		return EmployeeId;
	}
	public String getLastName() {
		return super.lastName+","+jobTitle;
	}
	
}
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 obj=new Employee1("Himani","Kumari",123,"Software Developer");
		Employee1 obj1=new Employee1("Soumya","Patra", 234,"Senior Engneer");
		System.out.println(obj.getEmployeeID()+","+obj.getFirstName()+","+obj.getLastName());
		System.out.println(obj1.getEmployeeID()+","+obj1.getFirstName()+","+obj1.getLastName());
		
	}

}
