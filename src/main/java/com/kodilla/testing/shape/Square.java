package com.kodilla.testing.shape;

public class Square implements Shape{
    private double side;
    private String name;

    public Square(double side, String name){
        this.side=side;
        this.name=name;
    }
    public String getShapeName(){
        return name;
    }
    public double getShapeField(){
        return 2*side;
    }
}
