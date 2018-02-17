package com.bvan.javastart.lesssons7_8.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class VectorSum {

    public static void main(String[] args) {
        int[] a = {10, 20, 40, 10};
        int[] b = {50, 10, 80};

        int len = Math.min(a.length, b.length);
        int[] res = new int[len];
        for (int i = 0; i < res.length; i++) {
            res[i] = a[i] + b[i];
        }

        System.out.println(Arrays.toString(res));
    }
}
