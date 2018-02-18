package com.bvan.javastart.lesssons7_8.valuestoring;

/**
 * @author bvanchuhov
 */
public class StringStoring2 {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;

        s2 = s2.toUpperCase();
        s1 = s2;

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
