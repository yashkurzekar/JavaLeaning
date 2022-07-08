package testExam;
import java.util.Scanner;

public class replaceSpaceWithUnderscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User name generator/Formatter");
        System.out.println("Enter Name");
        String name = sc.nextLine();
        String name2 = name.replace(" ","_");
        System.out.print("Your User name is - ");
        System.out.println(name2);
    }
}
