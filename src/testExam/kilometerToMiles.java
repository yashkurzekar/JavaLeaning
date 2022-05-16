package testExam;
import java.util.Scanner;

//Kilometers to miles

public class kilometerToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kilometers to Miles convertor");
        System.out.println("Enter kilometer");
        float kilometer = sc.nextFloat();
        float miles = kilometer * 0.621371f;
        System.out.println(kilometer+" Kilometers means "+miles);
        System.out.println("Thanks for using our services");

    }
}

