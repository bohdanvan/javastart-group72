package com.bvan.javastart.lesssons7_8.method;

/**
 * @author bvanchuhov
 */
public class RangeSum {

    public static void main(String[] args) {
        int x = rangeSum(20, 10);
        System.out.println(x);
    }

    public static int rangeSum(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("from > to");
        }

        int s = 0;
        for (int n = from; n <= to; n++) {
            s += n;
        }
        return s;
    }
}
