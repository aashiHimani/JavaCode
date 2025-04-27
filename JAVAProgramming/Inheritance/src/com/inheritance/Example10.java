package com.inheritance;

class Employees{
	private String name;
	private String address;
	private double salary;
	private String jobTitle;
	
	
	public Employees(String name, String address, double salary, String jobTitle) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public double getSalary() {
		return salary;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public double calculateBonus() {
		return 0.0;
	}
	public String generatePerformanceReport() {
		return "No performance available";
	}
}
class Manager extends Employees{
	private int numberOfSubordinates;
	public Manager(String name, String address, double salary, String jobTitle,int numberOfSubordinates) {
		super(name, address, salary, jobTitle);
		this.numberOfSubordinates=numberOfSubordinates;
	}
	public int getNumberOfSubordinates() {
		return numberOfSubordinates;
	}
	public double calculateBonus() {
		return getSalary()*0.20;
	}
	public String generatePerformanceReport() {
		return "Performance report of Manager "+getName()+" is Very Good";
	}
	public void manageProject() {
		System.out.println("manager "+getName()+" is managing a project");
	}
}
class Developer extends Employees{
	private String language;
	public Developer(String name, String address, double salary, String jobTitle,String language) {
		super(name, address, salary, jobTitle);
		this.language=language;
	}
	public String getLanguage() {
		return language;
	}
	public double calculateBonus() {
		return getSalary()*0.15;
	}
	public String generatePerformanceReport() {
		return "Performance report of Developer "+getName()+" is Excellent";
	}
	public void manageProject() {
		System.out.println("Developer "+getName()+" is very good in "+getLanguage());
	}
}
class Programmer extends Employees{
	private String language;
	public Programmer(String name, String address, double salary, String jobTitle,String language) {
		super(name, address, salary, jobTitle);
		this.language=language;
	}
	public String getLanguage() {
		return language;
	}
	public double calculateBonus() {
		return getSalary()*0.12;
	}
	public String generatePerformanceReport() {
		return "Performance report of Programmer "+getName()+" is good";
	}
	public void manageProject() {
		System.out.println("Programmer "+getName()+" is debugging code in "+getLanguage());
	}
}
public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager("Soumya", "Orrisa",2500000.0,"Senior Consultsant",5);
		Developer d=new Developer("Himani","Bihar",2000000.0,"Senior developer","Java");
		Programmer p=new Programmer("Raktima","Tripura",1500000.0,"Engineer","Python");
		
		System.out.println("Manager bonus is "+m.calculateBonus());
		System.out.println("Developer bonus is "+d.calculateBonus());
		System.out.println("Programmer bonus is "+p.calculateBonus()+"\n");
		
		System.out.println("Manager bonus is "+m.generatePerformanceReport());
		System.out.println("Developer bonus is "+d.generatePerformanceReport());
		System.out.println("Programmer bonus is "+p.generatePerformanceReport()+"\n");
		
		m.manageProject();
		d.manageProject();
		p.manageProject();
	}

}
