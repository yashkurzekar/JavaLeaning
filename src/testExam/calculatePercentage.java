package testExam;
import java.util.Scanner;
/* Question : Write a program to calculate the percentage of a given student in the CBSE board exam.
 His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100) */

public class calculatePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to your percentage calulator.");
        System.out.println("Note* we calculate only for 5 subjects ");
        System.out.println("Enter Your Subject 1 marks");
        byte a = sc.nextByte();
        System.out.println("Enter Your Subject 2 marks");
        byte b = sc.nextByte();
        System.out.println("Enter Your Subject 3 marks");
        byte c = sc.nextByte();
        System.out.println("Enter Your Subject 4 marks");
        byte d = sc.nextByte();
        System.out.println("Enter Your Subject 5 marks");
        byte e = sc.nextByte();

        int total = a+b+c+d+e;
        int percentage = ( total*100)/ 500;
        System.out.println("Subject 1 marks is " +a);
        System.out.println("Subject 2 marks is "+b);
        System.out.println("Subject 3 marks is "+c);
        System.out.println("Subject 4 marks is "+d);
        System.out.println("Subject 5 marks is "+e);
        System.out.println("Your total is "+ total);
        System.out.println("Your Total Percentages is "+percentage);


    }
}
