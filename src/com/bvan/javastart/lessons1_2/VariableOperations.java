package com.bvan.javastart.lessons1_2;

/**
 * @author bvanchuhov
 */
public class VariableOperations {

    public static void main(String[] args) {
        int age = 25;

        age = age + 10;
        age += 10;

        age = age + 1;
        age += 1;
        age++; // increment
        ++age;

        age--; // decrement
        --age;

        System.out.println(age);
    }
}
