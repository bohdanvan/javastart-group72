package com.bvan.javastart.lesssons7_8.practice;

/**
 * @author bvanchuhov
 */
public class RangeChecker {

    public static void main(String[] args) {
        boolean res1 = isAllInRange(new double[]{150, 50}, 10, 200);// ---> true
        boolean res2 = isAllInRange(new double[]{150, 50}, 100, 200);// ---> false

        System.out.println(res1);
        System.out.println(res2);
    }

    public static boolean isAllInRange(double[] shapes,
                                       double minShape,
                                       double maxShape) {
        for (double shape : shapes) {
            if (!isInRange(shape, maxShape, minShape)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isInRange(double s, double maxShape, double minShape) {
        return s >= minShape && s <= maxShape;
    }

}
