package com.creationaldesignpattern.prototype;
/*
Imagine working on drawing application,need to create & manipulate various shapes.Each shape might have
different attributes like color or size.Creating new shape class for every variation becomes tedious.
Also,dynamically adding or removing shapes during runtime can be challenging.
 */

//protoype interface
interface Shape {
    Shape clone();
    void draw();
}

//concrete prototype
class Circle implements Shape {
    private String color;
    public Circle(String color) {
        this.color=color;
    }
    @Override
    public Shape clone() {
        return new Circle(this.color);
    }
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle.");
    }
}

//client
class ShapeClient {
    private Shape shapePrototype;

    public ShapeClient(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    public Shape createShape() {
        return shapePrototype.clone();
    }
}

public class PrototypeDesign {
    public static void main(String[] args) {
        Shape circlePrototype = new Circle("red");
        ShapeClient client = new ShapeClient(circlePrototype);
        Shape redCircle = client.createShape();
        redCircle.draw();
    }
}
