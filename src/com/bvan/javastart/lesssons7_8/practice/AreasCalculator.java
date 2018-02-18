package com.bvan.javastart.lesssons7_8.practice;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class AreasCalculator {

    public static void main(String[] args) {
        double[] widths = {10, 30};
        double[] heights = {20, 20};
        double[] res = rectangleAreas(widths, heights);// ---> {200, 600}
        System.out.println(Arrays.toString(res));
    }

    public static double[] rectangleAreas(double[] widths,
                                          double[] heights) {
        if (widths.length != heights.length) {
            throw new IllegalArgumentException("different sizes of widths and heights");
        }

        double[] res = new double[widths.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = Geometry.rectangleArea(widths[i], heights[i]);
        }
        return res;
    }

}
