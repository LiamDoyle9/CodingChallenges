package com.company;

import java.util.Scanner;

public class doubleLetters {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your string here...");
        String s = scanner.nextLine();

        System.out.println("Double letters: " + doubleLetterChecker(s));

    }


    public static boolean doubleLetterChecker(String s){
        boolean result = false;
        for (int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                result = true;
            }
        }
        return result;
    }


}
