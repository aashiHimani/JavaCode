package com.inheritance;

class Employee{
	int salary;
	public Employee(int salary) {
		super();
		this.salary = salary;
	}
	void work() {
		System.out.println("employee work..");
	}
	public int getSalary() {
		return salary;
	}
}
class HRManager extends Employee{
	public HRManager(int salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}
	void work() {
		System.out.println("HRmanager work..");
	}
	void addEmployee() {
		System.out.println("add employee...");
	}
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRManager obj=new HRManager(12000000);
		System.out.println(obj.getSalary());
		obj.addEmployee();
		obj.work();
	}

}
