package com.oops;

class Employee{
	private String name;
	private String jobTitle;
	private double salary;
	public Employee(String name, String jobTitle, double salary) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double calculateSalary(double percentage) {
		return salary+=salary*percentage/100;
	}
	public void details() {
		System.out.println("Name of employee is "+name+" ,job title is "+jobTitle+" and salary is "+salary+"\n");
	}
}
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("Himani","Software Developer",1200000.0);
		Employee e1=new Employee("Soumya","Senior Developer",1500000.0);
		e.details();
		e1.details();
		e.calculateSalary(15.0);
		e.details();
	}

}
