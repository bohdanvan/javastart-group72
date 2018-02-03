package com.bvan.javastart.lessons1_2;

/**
 * @author bvanchuhov
 */
public class Casting {

    public static void main(String[] args) {
        long l = 200;
        byte b = (byte) l; // bad style
        System.out.println(b); // -56
    }
}
