package com.creationaldesignpattern.builder;

/*
tasked with implementing a system for building custom computers.Each computer can have different
configurations based on user preferences.goal is to provide flexibility in creating computers with
varying CPUs, RAM, and storage options.
 */

// Product
class Computer {
    private String cpu;
    private String ram;
    private String storage;
    public void setCPU(String cpu) {
        this.cpu=cpu;
    }
    public void setStorage(String storage) {
        this.storage=storage;
    }
    public void setRAM(String ram) {
        this.ram=ram;
    }
    public void displayInfo() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println();
    }
}

// Builder interface
interface Builder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Computer getResult();
}

class GamingComputerBuilder implements Builder {
    private Computer computer = new Computer();
    @Override
    public void buildCPU() {
        computer.setCPU("Gaming CPU");
    }
    @Override
    public void buildRAM() {
        computer.setRAM("16GB DDR4");
    }
    @Override
    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }
    @Override
    public Computer getResult() {
        return computer;
    }
}

// Director
class ComputerDirector {
    public void construct(Builder builder) {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }
}

// Client
public class Builderpattern {
    public static void main(String[] args) {
        GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector();

        director.construct(gamingBuilder);
        Computer gamingComputer = gamingBuilder.getResult();

        gamingComputer.displayInfo();
    }
}
