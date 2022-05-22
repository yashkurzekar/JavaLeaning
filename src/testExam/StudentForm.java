package testExam;
import java.util.Scanner;
public class StudentForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Yash Technologies");
        System.out.println("Please Enter your details to get selected");
        System.out.println("Enter Your Name ");
        String Name = sc.next();
        System.out.println("Enter Your Collage Name ");
        String clg = sc.nextLine();
        System.out.println("Enter Your Branch");
        String branch = sc.next();
        System.out.println("Enter Your age");
        int age = sc.nextInt();

        System.out.println(Name);
        System.out.println(clg);
        System.out.println(branch);
        System.out.println(age);
        System.out.println("Thanks for using Yash Technologies");


    }
}
