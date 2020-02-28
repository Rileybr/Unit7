package com.company;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double w, double l){
        length = l;
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double area(){
        return width*length;
    }
}
