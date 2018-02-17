package com.bvan.javastart.lesssons7_8.method;

/**
 * @author bvanchuhov
 */
public class SumExample {

    // Client
    public static void main(String[] args) {
        int x = sum(10, 20); // method call
        int y = sum(40, 50);
        System.out.println(x);
        System.out.println(y);
    }

    // Creator
    public static int sum(int a, int b) {
        int s = a + b;
        return s;
    }
}
