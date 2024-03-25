package com.javapractice.lib;

import java.util.Scanner;

import javax.swing.text.Style;

public class MyClass {
    public static void main(String[] args){


        Scanner s1 = new Scanner(System.in);

        System.out.println("Type a text :");

        char[] letters = s1.nextLine().toCharArray();

        System.out.println("The reversed string is :");

        char[] new_string_array = {};

        for(int i = letters.length -1; i >= 0 ; i-- ) {
            System.out.println(letters[i]);
        }

        System.out.println(new_string_array);


    }
}