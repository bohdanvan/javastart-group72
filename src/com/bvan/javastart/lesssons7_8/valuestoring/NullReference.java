package com.bvan.javastart.lesssons7_8.valuestoring;

/**
 * @author bvanchuhov
 */
public class NullReference {

    public static void main(String[] args) {
        String s1 = null;
        String s2 = "";

        if (s1 != null) {
            System.out.println(s1.length());
        }

        int length = s1.length();
        System.out.println(length);
    }
}
