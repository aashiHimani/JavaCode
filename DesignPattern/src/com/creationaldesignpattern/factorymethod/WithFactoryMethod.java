package com.creationaldesignpattern.factorymethod;

/* problem
Consider a software application that needs to handle the creation of various types of vehicles, such as Two Wheelers and Four Wheelers.
Each type of vehicle has its own specific properties and behaviors.
 */


//Product interface
abstract class Vehicles{
    public abstract void printVehicle();
}

//Concrete products
class TwoWheelers extends Vehicles{
    @Override
    public void printVehicle() {
        System.out.println("two wheeler");
    }
}
class FourWheelers extends Vehicles{
    @Override
    public void printVehicle() {
        System.out.println("four wheeler");
    }
}

//Creator interface
interface VehicleFactory{
    Vehicles createVechicle();
}

//Concrete creator
class TwoWheelerFactory implements VehicleFactory{
    @Override
    public Vehicles createVechicle() {
        return new TwoWheelers();
    }
}
class FourWheelerFactory implements VehicleFactory{
    @Override
    public Vehicles createVechicle() {
        return new FourWheelers();
    }
}

class Clients{
    private Vehicles pvehicles;
    public Clients(VehicleFactory factory){
        pvehicles=factory.createVechicle();
    }
    public Vehicles getPvehicles() {
        return pvehicles;
    }
}

public class WithFactoryMethod {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory=new TwoWheelerFactory();
        Clients twoWheelerClient=new Clients(twoWheelerFactory);
        Vehicles twoWheeler=twoWheelerClient.getPvehicles();
        twoWheeler.printVehicle();

        VehicleFactory fourWheelerFactory=new FourWheelerFactory();
        Clients fourWheelerClient=new Clients(fourWheelerFactory);
        Vehicles fourWheeler=fourWheelerClient.getPvehicles();
        fourWheeler.printVehicle();
    }
}

/*
Define a Factory Interface: Create an interface, VehicleFactory, with a method to produce vehicles.
Create Specific Factories: Implement classes like TwoWheelerFactory and FourWheelerFactory that follow the VehicleFactory interface,
providing methods for each vehicle type.
Revise the Client Class: Change the Client class to use a VehicleFactory instance instead of creating vehicles directly.
This way, it can request vehicles without using conditional logic.
Enhance Flexibility: This structure allows for easy addition of new vehicle types by simply creating new factory classes,
without needing to alter existing Client code.
 */