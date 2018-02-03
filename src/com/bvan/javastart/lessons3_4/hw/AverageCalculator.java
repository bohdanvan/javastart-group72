package com.bvan.javastart.lessons3_4.hw;

/**
 * @author bvanchuhov
 */
public class AverageCalculator {

    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        int avg = a / 2 + b / 2 + (a % 2 + b % 2) / 2;

        System.out.println("avg = " + avg);
    }
}
