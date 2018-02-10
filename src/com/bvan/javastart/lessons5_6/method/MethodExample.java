package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class MethodExample {

    // Client
    public static void main(String[] args) {
        int x = min(10, 20); // вызов метода
        int y = min(40, 20);
        int sum = x + y;
        System.out.println(sum);

        System.out.println(min(10, 20));
    }

    // Creator
    public static int min(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

    public static int min(int a, int b, int c) {
        return min(a, min(b, c));
    }
}
