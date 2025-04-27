package com.polymorphism;

class Employee{
	private String name;
	private String role;
	public Employee(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	public double calculateSalary() {
		return 0.0;
	}
}
class Manager extends Employee{
	private double baseSalary;
	private double bonus;
	public Manager(String name, double baseSalary, double bonus) {
		super(name,"Manager");
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}
	public double calculateSalary() {
		return baseSalary+bonus;
	}
}
class Programmer extends Employee{
	private double baseSalary;
	private double overTimePay;
	public Programmer(String name, double baseSalary, double overTimePay) {
		super(name,"Programmer");
		this.baseSalary = baseSalary;
		this.overTimePay = overTimePay;
	}
	public double calculateSalary() {
		return baseSalary+overTimePay;
	}
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Manager("Himani",75000.0,5000.0);
		Employee e2=new Programmer("Soumya",50000.0,200000.0);
		System.out.println("Manager:"+"name: "+e1.getName()+"role: "+e1.getRole()+" salary is:"+e1.calculateSalary());
		System.out.println("Prograamer:"+"name: "+e2.getName()+"role: "+e2.getRole()+" salary is:"+e2.calculateSalary());
	
	}

}
