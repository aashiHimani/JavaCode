package com.oops;

import java.time.LocalDate;
import java.time.Period;

class Employees{
	private String name;
	private double salary;
	private LocalDate hireDate;
	public Employees(String name, double salary, LocalDate hireDate) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public int yearsOfService() {
		return Period.between(hireDate, LocalDate.now()).getYears();
	}
	public void employeesDetails() {
		System.out.println("Name: "+name+" ,salary:"+salary+" hire date is: "+hireDate);
	}
}
public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e= new Employees("Himani",5600000.9,LocalDate.parse("2021-04-08"));
		Employees e1=new Employees("Soumya",7800000.67,LocalDate.parse("2021-09-21"));
		Employees e2=new Employees("Lucky",8900000.4,LocalDate.parse("2022-06-22"));
		e.employeesDetails();
		System.out.println("employee "+e.getName()+" have "+e.yearsOfService()+ " years of exp..");
		e1.employeesDetails();
		System.out.println("employee "+e1.getName()+" have "+e1.yearsOfService()+ " years of exp..");
		e2.employeesDetails();
		System.out.println("employee "+e2.getName()+" have "+e2.yearsOfService()+ " years of exp..");
	}

}
