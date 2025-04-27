package com.interfaces.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Stud{
	int age;
	String name;
	public Stud(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
}
class CustomerSortingComapre implements Comparator<Stud>{
	
		@Override
		public int compare(Stud o1, Stud o2) {
			// TODO Auto-generated method stub
			int NameCompare = o1.getName().compareTo(o2.getName());
			int AgeCompare = o1.getAge().compareTo(o2.getAge());
			return (NameCompare == 0) ? AgeCompare: NameCompare;
		}
}

public class ComparatorInterfaceMoreField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Stud> al = new ArrayList<>();
        Stud obj1 = new Stud(24,"Himu");
        Stud obj2 = new Stud(25,"somu");
        Stud obj3 = new Stud(23,"lucky");
        Stud obj4 = new Stud(26,"chimpu");
        Stud obj5 = new Stud(22,"aashi");
        Stud obj6 = new Stud(27,"shreya");
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);
        Iterator<Stud> custIterator = al.iterator();
        System.out.println("Before Sorting:\n");
        while (custIterator.hasNext()) {
            System.out.println(custIterator.next());
        }
        Collections.sort(al,new CustomerSortingComapre());
        System.out.println("\n\nAfter Sorting:\n");
        for (Stud customer : al) {
            System.out.println(customer);
        }
	}

}
