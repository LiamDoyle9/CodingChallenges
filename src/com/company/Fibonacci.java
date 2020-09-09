package com.company;

public class Fibonacci {

    public static void main(String[] args){
        System.out.println(nthFibTerm(5));
    }

    public static int nthFibTerm(int n){
        if(n < 2){
            return n;
        }
        return nthFibTerm(n-1) + nthFibTerm(n-2);
    }

}
