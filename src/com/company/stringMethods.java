package com.company;

import java.util.Locale;
import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "harry";

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
        System.out.println(name.substring(2,3));

        //replace char
        System.out.println(name.replace('r','p'));
        //replace string
        System.out.println(name.replace("rry","ier"));

        //starts with
        System.out.println(name.startsWith("Har"));
        //ends with
        System.out.println(name.endsWith("rry"));

        // what is the character at
        System.out.println(name.charAt(2));

        //what is the index of a given substring
        System.out.println(name.lastIndexOf("r"));

        //last index of
        String name3 = "Harryrryrry";
        System.out.println(name3.lastIndexOf("rry",4));

        // Equals
        System.out.println(name.equals("harry"));

        System.out.println(name.equalsIgnoreCase("HaRrY"));
    }
}
