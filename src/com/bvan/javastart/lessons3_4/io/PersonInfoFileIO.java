package com.bvan.javastart.lessons3_4.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonInfoFileIO {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("person.txt"));

        String name = scan.next();
        int age = scan.nextInt();

        scan.close();

        // BL
        String message = "I'm " + name + ", "
                + age + " years old";

        // Output
        System.out.println(message);
    }
}
