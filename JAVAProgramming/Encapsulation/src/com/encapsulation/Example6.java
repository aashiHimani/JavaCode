package com.encapsulation;

class Car{
	private String company_name;
	private String model_name;
	private int year;
	private double mileage;
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getMileage() {
		return mileage;
	}
}
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.setCompany_name("Yamaha");
		c.setModel_name("R15");
		c.setYear(2021);
		System.out.println("Company name:"+c.getCompany_name()+" model name:"+c.getModel_name()+" year:"+c.getYear()+" mileage:"+c.getMileage());

	}

}
