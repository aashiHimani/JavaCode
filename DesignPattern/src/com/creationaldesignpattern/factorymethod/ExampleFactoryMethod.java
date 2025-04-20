package com.creationaldesignpattern.factorymethod;

interface Employees{
    public abstract void getSalary();
}
class Android implements Employees{
    @Override
    public void getSalary() {
        System.out.println("salary is 1000");
    }
}
class Web implements Employees{
    @Override
    public void getSalary() {
        System.out.println("salary is 2000");
    }
}
class EmployeeFactory{
    private Employees employees;
    public static Employees getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("android")){
            return new Android();
        }
        else if(empType.trim().equalsIgnoreCase("web")){
           return new Web();
        }
        else{
            return null;
        }
    }
}
public class ExampleFactoryMethod {
    public static void main(String[] args) {
        Employees employees= (Employees) EmployeeFactory.getEmployee("android");
        employees.getSalary();
    }
}
