package com.company.shape;

public class Rectangle {
    double longs;
    double width;
    double perimeter;
    double acreage;
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLongs() {
        return longs;
    }

    public void setLongs(double longs) {
        this.longs = longs;
    }
    public Rectangle(double longs,double width){
        this.longs = longs;
        this.width = width;
    }
    public void setPerimeter(double longs, double width){
        perimeter = longs + width;
    }
    public void setAcreage(double longs, double width){
        acreage = longs * width;
    }
    public double getPerimeter(){
        return perimeter;
    }
    public double getAcreage(){
        return acreage;
    }
}
