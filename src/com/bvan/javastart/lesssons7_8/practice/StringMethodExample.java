package com.bvan.javastart.lesssons7_8.practice;

/**
 * @author bvanchuhov
 */
public class StringMethodExample {

    public static void main(String[] args) {
        String s = "123";
        s = addHello(s);
        System.out.println(s);
    }

    private static String addHello(String s) {
//        s += "Hello"; // BAD CODE
        return s + "Hello";
    }
}
