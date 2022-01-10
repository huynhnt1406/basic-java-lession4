package com.company;

import com.company.shape.Circle;
import com.company.shape.Rectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radius;
        double longs;
        double width;
        System.out.println("Access radius of circle");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        circle.setAcreage(radius);
        circle.setPerimeter(radius);
        System.out.println("Acreage of circle " + circle.getAcreage());
        System.out.println("Perimeter of circle " + circle.getPerimeter());
        System.out.println("Access long of rectangle ");
        longs = sc.nextDouble();
        System.out.println("Access width of rectangle ");
        width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(longs, width);
        rectangle.setAcreage(longs,width);
        rectangle.setPerimeter(longs,width);
        System.out.println("Acreage of rectangle " + rectangle.getAcreage());
        System.out.println("Perimeter of rectangle " + rectangle.getPerimeter());
    }
}
