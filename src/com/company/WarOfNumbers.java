package com.company;

/**
 * There's a great war between the even and odd numbers. Many numbers already lost their life in this war and it's your task to end this. You have to determine which group is larger: the even, or the odd. The larger group wins.
 *
 * Create a function that takes an array of integers and sum up the even and odd numbers seperatly and then substract the smaller one from the bigger one. Return the substraction.
 */



public class WarOfNumbers {

    public static void main(String[] args){
        int[] array = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(warOfNumbers(array));
    }

    public static int warOfNumbers(int[] array){
        int evensTotal = 0;
        int oddsTotal = 0;
        int result = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                evensTotal += array[i];
            } else{
                oddsTotal += array[i];
            }
        }

        if (evensTotal > oddsTotal){
            result = evensTotal - oddsTotal;
        } else {
            result = oddsTotal - evensTotal;
        }
        return result;
    }
}
