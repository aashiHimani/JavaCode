package main.thiskeyword;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void printDetails() {
		System.out.println("Name: "+this.name+" Age:"+this.age);
	}
}
public class ImplementThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("himu",24);
		p.printDetails();
		p.setName("somu");
		p.printDetails();
	}

}
