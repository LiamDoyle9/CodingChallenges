package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Write a function that takes a string as an argument and returns the left most digit in the string.
 */
public class LeftMostDigit {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string here...");
        String s = scanner.nextLine();

        System.out.println(extractLeftMostDigits(s));
    }

    public static int extractLeftMostDigits(String s){
        return Integer.valueOf(s.replaceAll("\\D+","").substring(0,1));
    }


}
