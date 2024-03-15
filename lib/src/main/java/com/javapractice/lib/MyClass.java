package com.javapractice.lib;

import java.awt.SystemTray;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);

        System.out.println("Type the radius :");

        int radius= s1.nextInt();

        float perimeter = (float) ((float) 2 * Math.PI * radius);
        float area = (float) Math.PI * radius*radius;

        System.out.println("The perimeter is :" + perimeter);
        System.out.println("The area is :" + area);

    }
}