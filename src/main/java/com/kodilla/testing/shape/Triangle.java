package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double side;
    private double height;
    private String name;

    public Triangle(double side, double height, String name){
        this.side = side;
        this.height = height;
        this.name = name;
    }
    public String getShapeName(){
        return name;
    }
    public double getShapeField(){
        return (side*height)/2;
    }
}
