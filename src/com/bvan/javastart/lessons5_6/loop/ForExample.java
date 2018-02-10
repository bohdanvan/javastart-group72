package com.bvan.javastart.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        // n = 10...20
        for (int n = 10; n <= 20; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 40, 39, 38 ... 30
        for (int n = 40; n >= 30; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 100, 200, 300, ... 1000
        for (int n = 100; n <= 1000; n += 100) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
