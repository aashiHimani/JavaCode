package com.creationaldesignpattern.abstractfactorymethod;
/* problem
design system to create cars with specific configurations for different regions,such as North America and Europe.
Each region may have unique requirements & regulations,& want to ensure that cars produced for each region meet those standards.
 */
/* challenges
Different regions have different cars with different features, so designing this can be challenging.
Other main challenge is to ensure consistency in production of cars & their specifications within each region.
There can be updation in having new cars in different regions so adapting system to changes in regulations or introducing new features for a specific region becomes challenging.
So, Modifications would need to be made in multiple places, increasing the chances of introducing bugs and making the system more prone to errors.
 */
/* solve challenges
Different regions has their own factory to create cars for local needs.
This helps to kees the design and features same for vehicles in each region.
change one region without affecting others (e.g., updating North America doesn’t impact Europe).
To add a new region, just create a new factory, no need to change existing code.
The pattern keeps car creation separate from how they are used.
 */

//abstract factory interface
interface CarFactory{
    Car createCar();
    CarSpecification carSpecification();
}

//concrete factory
class NorthAmericaCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Sedan();
    }
    @Override
    public CarSpecification carSpecification() {
        return new NorthAmericaSpecification();
    }
}
class EuropeCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new HatchBack();
    }
    @Override
    public CarSpecification carSpecification() {
        return new EuropeSpecification();
    }
}

//abstract product
interface Car{
    void assemble();
}
interface CarSpecification{
    void display();
}

//concrete product
class Sedan implements Car{
    @Override
    public void assemble() {
        System.out.println("assembling sedan car");
    }
}
class HatchBack implements Car{
    @Override
    public void assemble() {
        System.out.println("assembling hatch back car");
    }
}
class NorthAmericaSpecification implements CarSpecification{
    @Override
    public void display() {
        System.out.println("display north america");
    }
}
class EuropeSpecification implements CarSpecification{
    @Override
    public void display() {
        System.out.println("display europe");
    }
}

public class WithAbstractFactoryMethod {
    public static void main(String[] args) {
        CarFactory naFactory=new NorthAmericaCarFactory();
        Car naCar=naFactory.createCar();
        CarSpecification naSpec=naFactory.carSpecification();
        naCar.assemble();
        naSpec.display();

        CarFactory eFactory=new EuropeCarFactory();
        Car eCar=eFactory.createCar();
        CarSpecification eSpec=eFactory.carSpecification();
        eCar.assemble();
        eSpec.display();
    }
}
