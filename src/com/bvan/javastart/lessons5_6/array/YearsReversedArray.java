package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class YearsReversedArray {

    public static void main(String[] args) {
        int[] years = new int[19];

        int year = 2018;
        for (int i = 0; i < years.length; i++) {
            years[i] = year;
            year--;
        }

//        int i = 0;
//        for (int year = 2018; year >= 2000; year--) {
//            years[i] = year;
//            i++;
//        }

        System.out.println(Arrays.toString(years));
    }
}
