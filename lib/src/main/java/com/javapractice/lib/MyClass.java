package com.javapractice.lib;

import java.awt.SystemTray;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);
        String input_String = s1.nextLine();
        cout(input_String);
        System.out.println("Enter a text :");


    }

    public static void cout(String x){

        char[] ch = x.toCharArray();
        int letter = 0, space = 0, num = 0, others = 0;

        for (int i = 0 ; i < x.length(); i++){
            if(Character.isLetter(ch[i])){
                letter++;
            } else if(Character.isDigit(ch[i])){
                num++;
            } else if(Character.isSpaceChar(ch[i])){
                space++;
            } else {
                others++;
            }
        }

        System.out.println("Letters: " +letter);
        System.out.println("Numbers: " +num);
        System.out.println("Spaces: " +space);
        System.out.println("Others: " +others);

    }
}