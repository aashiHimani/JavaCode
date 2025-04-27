package com.creationaldesignpattern.abstractfactorymethod;

interface Employee{
    int salary();
    String name();
}
class Android implements Employee{
    @Override
    public int salary() {
        return 5000;
    }
    @Override
    public String name() {
        return "name is android";
    }
}
class Web implements Employee{
    @Override
    public int salary() {
        return 4000;
    }
    @Override
    public String name() {
        return "name is web";
    }
}
abstract class EmployeeAbstract{
    public abstract Employee createEmployee();
}
class EmployeeFactory{
    public static Employee getEmployee(EmployeeAbstract factory){
        return factory.createEmployee();
    }
}
class AndroidFactory extends EmployeeAbstract{
    @Override
    public Employee createEmployee() {
        return new Android();
    }
}
class WebFactory extends EmployeeAbstract{
    @Override
    public Employee createEmployee() {
        return new Web();
    }
}

public class ExampleAbstractFactory {
    public static void main(String[] args) {
       Employee e1= EmployeeFactory.getEmployee(new AndroidFactory());
       e1.name();
       Employee e2= EmployeeFactory.getEmployee(new WebFactory());
       e2.name();
    }
}
