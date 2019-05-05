package com.kodilla.testing.shape;

import java.util.ArrayList;



public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<>();
    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public boolean removeFigure(Shape shape){
        int startingSize = shapes.size();
        shapes.remove(shape);
        if(startingSize==shapes.size()){
            return false;
        } else {
            return true;
        }
    }
    public Shape getFigure(int a){
        int correctValue = shapes.size() - 1;
        if(correctValue>=a && a>=0){
            return shapes.get(a);
        } else {
            return null;
        }
    }
    public ArrayList<String> showFigures(){
        ArrayList<String> names = new ArrayList<>();
        for(Shape shapeName : shapes){
            String name = shapeName.getShapeName();
            names.add(name);
        }
        return names;
    }
    public int getSize(){
        return shapes.size();
    }

}
