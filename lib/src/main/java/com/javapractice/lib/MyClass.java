package com.javapractice.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the decimal number :");
        int number = s1.nextInt();

        String binary = Integer.toBinaryString(number);

        System.out.println("This is the binary version = " + binary);
    }
}