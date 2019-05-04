package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;
    private String name;

    public Circle(double radius, String name){
        this.name=name;
        this.radius=radius;
        this.name=name;
    }
    public String getShapeName(){
        return name;
    }

    public double getShapeField(){
        return radius*Math.PI;
    }
}
