package com.bvan.javastart.lessons3_4.io;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonInfoIO {

    public static void main(String[] args) {
        // Input
        // 1. Create a Scanner object
        // 2. IO Logic
        // 3. Close the Scanner (optional for console)

        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        int age = scan.nextInt();

        // scan.close(); // optional for console

        // BL
        String message = "I'm " + name + ", "
                + age + " years old";

        // Output
        System.out.println(message);
    }
}
