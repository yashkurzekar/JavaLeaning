package com.company;

import java.util.Scanner;

public class stringbasic {
    public static void main(String[] args) {
        String name = "Yash";
        System.out.print("Your user name is ");
        System.out.print("User Name is ");
        System.out.println(name);
        int a  = 6;
        float b = 12.12f;
        System.out.printf("The value of a is %d and value of b is %f",a,b);
        System.out.println();
        System.out.format("Using format The value of a is %d and value of b is %f",a,b);

        Scanner sc = new Scanner(System.in);
        String name1= sc.next();
        sc.next();
        String name2 = sc.nextLine();

        System.out.println(name1);
        System.out.println(name2);

    }
}
