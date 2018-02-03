package com.bvan.javastart.lessons3_4.object;

/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String text = "I love Java";

        int length = text.length();
        System.out.println("length = " + length);

        char c = text.charAt(1);
        System.out.println("c = " + c);

        char lastChar = text.charAt(text.length() - 1);
        System.out.println("lastChar = " + lastChar);

        String upperCaseText = text.toUpperCase();
        System.out.println("upperCaseText = " + upperCaseText);

        int indefOfJava = text.indexOf("Java");
        System.out.println("indefOfJava = " + indefOfJava);

        boolean startsWithJava = text.startsWith("Java");
        System.out.println("startsWithJava = " + startsWithJava);

        boolean equals = text.equals("I love JAVA");
        System.out.println("equals = " + equals);

        String reversedText = new StringBuilder(text).reverse().toString();
        System.out.println("reversedText = " + reversedText);
    }
}
