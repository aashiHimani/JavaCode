package com.string.main;

final class Employee{
	final String panCardNumber;
	public Employee(String panCardNumber) {
		super();
		this.panCardNumber = panCardNumber;
	}
	public String getPanCardNumber() {
		return panCardNumber;
	}
}
public class CreateImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("ASDF123");
		String s=e.getPanCardNumber();
		System.out.println(s);
	}

}
