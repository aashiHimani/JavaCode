package com.methodreference;
import java.util.*;

class Person1{
    private String name;
    private Integer age;
    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Integer getAge() { return age; }
    public String getName() { return name; }
}

class ComparisonProvider {
    public int compareByName(Person1 a, Person1 b){
        return a.getName().compareTo(b.getName());
    }
    public int compareByAge(Person1 a, Person1 b){
        return a.getAge().compareTo(b.getAge());
    }
}

public class InstanceMethodReference {
    public static void main(String[] args){
        List<Person1> personList1 = new ArrayList<>();
        personList1.add(new Person1("vicky", 24));
        personList1.add(new Person1("poonam", 25));
        personList1.add(new Person1("sachin", 19));
        ComparisonProvider comparator=new ComparisonProvider();
        Collections.sort(personList1,comparator::compareByName);
        System.out.println("Sort by name :");
        personList1.stream().map(x -> x.getName()).forEach(System.out::println);
        Collections.sort(personList1,comparator::compareByAge);
        System.out.println("Sort by age :");
        personList1.stream().map(x -> x.getName()).forEach(System.out::println);
    }
}
