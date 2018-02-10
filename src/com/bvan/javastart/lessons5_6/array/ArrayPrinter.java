package com.bvan.javastart.lessons5_6.array;

/**
 * @author bvanchuhov
 */
public class ArrayPrinter {

    public static void main(String[] args) {
        int[] array = {10, 40, -5};

        // fori + Tab
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

        for (int elem : array) {
            System.out.println(elem);
        }
    }
}
