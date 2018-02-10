package com.bvan.javastart.lessons5_6.condition;

/**
 * @author bvanchuhov
 */
public class IfExample {

    public static void main(String[] args) {
        int x = 31;

        if (x <= 10) {
            System.out.println("1");

            if (x > 0) {
                System.out.println("4");
            }
        } else {
            if (x != 30) {
                System.out.println("5");
            }
            System.out.println("2");
        }
        System.out.println("3");
    }
}
