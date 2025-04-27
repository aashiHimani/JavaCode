package com.encapsulation;

class Employee{
	private int employee_id;
	private String employee_name;
	private double employee_salary;
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public double getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(double employee_salary) {
		this.employee_salary = employee_salary;
	}
	public String getFormattedSalary() {
		return String.format("$%.2f", employee_salary);
	}
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEmployee_id(123);
		e.setEmployee_name("Himani");
		e.setEmployee_salary(560000.08);
		System.out.println("Employee id is: "+e.getEmployee_id()+" Employee name is: "+e.getEmployee_name()+" Employee salary is: "+e.getEmployee_salary()+" formatted salary is: "+e.getFormattedSalary());
	}

}
