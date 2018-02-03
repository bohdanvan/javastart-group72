package com.bvan.javastart.lessons3_4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class IPhone {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter money: ");
        long money = scan.nextLong();

        System.out.print("Enter your mood (happy/sad): ");
        boolean isHappy = scan.next().equals("happy");

        System.out.print("Does your girlfriend want? (yes/no): ");
        boolean girlfriendWants = scan.next().equals("yes");

        long iPhonePrice = 999;

        if ((!isHappy || girlfriendWants) && money >= iPhonePrice) {
            System.out.println("Buy!");
            money -= iPhonePrice;
        } else {
            System.out.println("Sadly");
        }
        System.out.println("Money left: " + money);
    }
}
