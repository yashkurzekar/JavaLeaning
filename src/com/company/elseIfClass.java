package com.company;
import java.util.Scanner;
public class elseIfClass {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        byte s1,s2,s3;
        System.out.println("Enter your marks in Mathematics");
        s1=sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        s2=sc.nextByte();
        System.out.println("Enter your marks in physics");
        s3=sc.nextByte();

        float avg = (s1+s2+s3)/3.0f;
        System.out.println("Your overall percentage is "+avg);
        if(avg>40 && s1>33 && s2>33 && s3>33){
            System.out.println("Congratulations, you did it ");
        }
        else {
            System.out.println("You are fail, Please try again ");
        }
    }
}
