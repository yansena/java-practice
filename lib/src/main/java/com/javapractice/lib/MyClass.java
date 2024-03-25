package com.javapractice.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args){

        int[] arrayOne = {1,3,-5,4};
        int[] arrayTwo = {1,4,-5,-2};
        String result = "";

        for (int i=0;i < arrayOne.length ; i++ ){
            int num1 = arrayOne[i];
            int num2 = arrayTwo[i];

            result += (num1 * num2)+ " ";
        }

        System.out.println("\nResult is: " + result);

//        Scanner s1 = new Scanner(System.in);

    }
}