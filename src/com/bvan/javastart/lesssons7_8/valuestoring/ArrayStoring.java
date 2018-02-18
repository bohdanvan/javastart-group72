package com.bvan.javastart.lesssons7_8.valuestoring;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayStoring {

    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = a;

        b[0] = 100;

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }
}
