package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
 */
public class ArraySquares {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your value here...");
        int input = scanner.nextInt();
        System.out.println("Your have entered: " + input);
        System.out.println("----------------------------");

        System.out.println(Arrays.deepToString(squarePatch(input)));

    }

    public static int[][] squarePatch(int n){
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = n;
            }
        }
        return arr;
    }

}
