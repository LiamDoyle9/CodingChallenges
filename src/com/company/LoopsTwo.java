package com.company;

import java.util.Scanner;

public class LoopsTwo {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        for(int i = 0; i < total; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            for (int j = 0; j < n; j++){
                a = a+b;
                if( j > 0){
                    System.out.println(" ");
                    System.out.println(a);
                    b = b*2;
                }
                System.out.println(" ");
            }
            scanner.close();
        }


    }

}
