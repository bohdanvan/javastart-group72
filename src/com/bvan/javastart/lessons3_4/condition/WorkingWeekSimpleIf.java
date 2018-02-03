package com.bvan.javastart.lessons3_4.condition;

/**
 * @author bvanchuhov
 */
public class WorkingWeekSimpleIf {

    public static void main(String[] args) {
        int day = 5;

        boolean isWorkingDay = day <= 5;
        if (isWorkingDay) {
            System.out.println("Work");

            if (day >= 4) {
                System.out.println("Drink Beer");
            }
        } else {
            System.out.println("Friends");
        }

        System.out.println("Java Courses");
    }
}
