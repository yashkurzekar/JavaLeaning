package testExam;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class employeeWage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Employee Wage");
        System.out.println("Enter Your name ");
        String Name = sc.next();
        System.out.println("Enter Your ID number");
        int id = sc.nextInt();
        System.out.println("Enter Your Address");
        String Add = sc.next();
        System.out.println("Enter Your Company Name");
        String company = sc.next();

        System.out.println(Name);
        System.out.println(id);
        System.out.println(Add);
        System.out.println(company);
        System.out.println("Thank you");

    }
}
