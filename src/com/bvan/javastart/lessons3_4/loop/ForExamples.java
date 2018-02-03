package com.bvan.javastart.lessons3_4.loop;

/**
 * @author bvanchuhov
 */
public class ForExamples {

    public static void main(String[] args) {
        // 1..10
        for (int n = 1; n <= 10; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 30..20
        for (int n = 30; n >= 20; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 10, 20, 30, ... 100
        for (int n = 10 ; n <= 100; n += 10) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 100, 102, 104, ... 120, evens
        for (int n = 100; n <= 120; n += 2) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
