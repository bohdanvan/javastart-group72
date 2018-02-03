package com.bvan.javastart.lessons3_4.io;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class SumIO {

    public static void main(String[] args) {
        // Input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = scan.nextInt();

        System.out.print("Enter y: ");
        int y = scan.nextInt();

        // BL
        int sum = x + y;

        // Output
        System.out.println("sum = " + sum);
    }
}
