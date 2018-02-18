package com.bvan.javastart.lesssons7_8.practice;

/**
 * @author bvanchuhov
 */
public class AreasSumCalculator {

    public static void main(String[] args) {
        double res = circleAreasSum(new double[]{10, 20});// ---> 1570.7963267948967
        System.out.println(res);
    }

    public static double circleAreasSum(double[] radiuses) {
        double res = 0;
        for (double r : radiuses) {
            res += Geometry.circleArea(r);
        }
        return res;
    }
}
