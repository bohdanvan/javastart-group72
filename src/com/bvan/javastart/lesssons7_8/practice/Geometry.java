package com.bvan.javastart.lesssons7_8.practice;

/**
 * @author bvanchuhov
 */
public class Geometry {

    public static void main(String[] args) {
        double area1 = rectangleArea(10.0, 20.0);
        double area2 = rectangleArea(30.0, 20.0);
        double area3 = circleArea(10.0);
        double area4 = circleArea(20.0);

        System.out.println("area1 = " + area1);
        System.out.println("area2 = " + area2);
        System.out.println("area3 = " + area3);
        System.out.println("area4 = " + area4);
    }

    public static double rectangleArea(double width,
                                       double height) {
        if (width <= 0) {
            throw new IllegalArgumentException("width <= 0");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("height <= 0");
        }
        return width * height;
    }

    public static double circleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius <= 0");
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
