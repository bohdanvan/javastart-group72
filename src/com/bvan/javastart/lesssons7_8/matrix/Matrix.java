package com.bvan.javastart.lesssons7_8.matrix;

/**
 * @author bvanchuhov
 */
public class Matrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        int elem = matrix[2][3];
        System.out.println(elem);

        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            printArray(row);
        }
    }

    public static void printArray(int[] array) {
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
