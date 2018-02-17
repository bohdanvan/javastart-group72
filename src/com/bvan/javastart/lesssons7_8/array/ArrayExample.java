package com.bvan.javastart.lesssons7_8.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = {10, 30, 20};

        a[3] = 5;
        int len = a.length; // 10

        System.out.println(Arrays.toString(a));
    }
}
