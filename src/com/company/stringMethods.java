package com.company;

import java.util.Locale;
import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(name);
        int value =name.length();
        System.out.println("Length of name is "+value);
        //sub lower case me kr dega
        String lowerCase = name.toLowerCase();
        System.out.println(lowerCase);
        //sub uppercase me kr dega
        String upperCase = name.toUpperCase();
        System.out.println(upperCase);
        //Side se spaces nikal dega
        String name2 = "         Hello  ";
        System.out.println(name2.trim());

        //return new string with index no
        System.out.println(name.substring(3));
    }
}
