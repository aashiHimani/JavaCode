package com.creationaldesignpattern.factorymethod;

abstract class Vehicle{
    public abstract void printVehicle();
}
class TwoWheeler extends Vehicle{
    @Override
    public void printVehicle() {
        System.out.println("two wheeler");
    }
}
class FourWheeler extends Vehicle{
    @Override
    public void printVehicle() {
        System.out.println("four wheeler");
    }
}
class Client{
    private Vehicle vehicle;
    public Client(int type){
        if(type==1)
            vehicle=new TwoWheeler();
        else if (type==2)
            vehicle=new FourWheeler();
        else
            vehicle=null;
    }
    public void cleanUp(){
        if (vehicle!=null)
            vehicle=null;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
}

public class WithoutFactoryMethod {
    public static void main(String[] args) {
        Client client=new Client(1);
        Vehicle vehicle=client.getVehicle();
        if(vehicle!=null)
            vehicle.printVehicle();
        client.cleanUp();
    }
}

/*
The Client class creates TwoWheeler & FourWheeler objects directly based on input.
This strong dependency makes code hard to maintain or update.
The Client class not only decides which vehicle to create but also handles its lifecycle.
This mixes responsibilities, which goes against principle that a class should only have one reason to change.
To add a new vehicle type, you must modify the Client class, which makes it difficult to scale the design.
This conflicts with the idea that classes should be open for extension but closed for modification.
 */