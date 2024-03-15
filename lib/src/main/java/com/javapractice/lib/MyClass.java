package com.javapractice.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);

        System.out.println("enter the first number");

        int n1 = s1.nextInt();

        System.out.println("enter the second number");
        int n2 = s1.nextInt();

        float division = (float) n1 / n2;
        float rest = n1 % n2;
        System.out.println("n1 / n2 = " + division);
        System.out.println("The remainder = " + rest);

    }
}