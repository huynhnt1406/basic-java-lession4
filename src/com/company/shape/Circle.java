package com.company.shape;

public class Circle {
    double radius;
    double perimeter;
    double acreage;
    final double PI = 3.14159265358979323846;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void setPerimeter(double radius){
        perimeter = 2 * PI *radius;
    }
    public void setAcreage(double radius){
        acreage = PI *radius*radius;
    }
    public double getPerimeter(){
        return perimeter;
    }
    public double getAcreage(){
        return acreage;
    }
}
