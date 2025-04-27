package com.inheritance.main;

import java.util.HashSet;
import java.util.Set;

class Bank{
	private String name;
	private Set<Employee> employees;
	public Bank(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
}

class Employee{
	private String name;

	public String getName() {
		return name;
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
}
public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank("HDFC");
		Employee emp=new Employee("Himu");
		Set<Employee> employee=new HashSet<>();
		employee.add(emp);
		bank.setEmployees(employee);
		System.out.println(emp.getName()+" belongs to "+bank.getName());
	}

}
//two separate class bank and employee are associated through their object.
//bank can have many employee, one-t-many relation