package com.bvan.javastart.lesssons7_8.array;

/**
 * @author bvanchuhov
 */
public class PositivesCounter {

    public static void main(String[] args) {
        int[] a = {-5, 2, 0, 10};

//        int count = 0;
//        for (int i = 0; i < a.length; i++) {
//            int elem = a[i];
//            if (elem > 0) {
//                count++;
//            }
//        }

        // for-each
        int count = 0;
        for (int elem : a) {
            if (elem > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
