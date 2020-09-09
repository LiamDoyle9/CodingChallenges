package com.company;

import java.util.Scanner;

public class PrintFormatting {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);


        for(int i  = 0; i < 3; i++){
            String s1 = scanner.next();
            int x = scanner.nextInt();
            //System.out.printf("%s %d", s1, x);
            System.out.printf("%-15s%03d", s1, x);
        }

        System.out.println("========================");


    }

}