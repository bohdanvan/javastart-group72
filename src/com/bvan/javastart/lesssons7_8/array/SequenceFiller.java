package com.bvan.javastart.lesssons7_8.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class SequenceFiller {

    public static void main(String[] args) {
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = 10 * (i + 1);
        }

        System.out.println(Arrays.toString(a));
    }
}
