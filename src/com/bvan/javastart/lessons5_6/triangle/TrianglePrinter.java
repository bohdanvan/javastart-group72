package com.bvan.javastart.lessons5_6.triangle;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        int size = 4;

        for (int count = 1; count <= size; count++) {
            for (int n = 1; n <= count; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
