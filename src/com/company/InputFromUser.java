package com.company;
import java.util.Scanner;
/* Reading data from the Keyboard :
Scanner class of java.util package is used to take input from the user's keyboard.The Scanner class has many methods for taking input from the user depending upon the type of input. To use any of the methods of the Scanner class, first, we need to create an object of the Scanner class as shown in the below example :
import java.util.Scanner;  // Importing  the Scanner class
Scanner sc = new Scanner(System.in);  //Creating an object named "sc" of the Scanner class.
Taking an integer input from the keyboard :

Scanner S = new Scanner(System.in);  //(Read from the keyboard)
int a = S.nextInt();  //(Method to read from the keyboard)*/
public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Your Age");
        byte age = sc.nextByte();
        System.out.println("Enter Your Phone Number");
        long num = sc.nextLong();
        System.out.println("Do You have Passport");
        boolean visa = sc.nextBoolean();

        System.out.println(name);
        System.out.println(age);
        System.out.println(num);
        System.out.println(visa);

        System.out.println("Thanks for visiting, bbye");


    }
}
