package com.company;

import java.util.Scanner;

public class RemoveVowels {



    public static String removeVowels(String s){
       return s.replaceAll("[AaEeIiOoUu]", "");
    }

    public static void main(String[] args){
        System.out.println("Enter your string here ...");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        System.out.println("String with vowels: " + string);
        System.out.println("String without vowels: " + removeVowels(string));



    }


}
