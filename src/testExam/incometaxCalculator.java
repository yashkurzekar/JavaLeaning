package testExam;
import java.util.Scanner;

public class incometaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tax = 0;
        System.out.println("Please enter your salary in Lakh's example 3.3");
        float income = sc.nextFloat();
        if(income<=2.5){
            tax+=0;
        }
        if(income>2.5f && income <=5f)
        {
            tax+=0.05f*(income-2.5f);
        }
        else if ( income>5f && income <=10.f) {
            tax+= 0.5f*(5.5f -2.5f);
            tax+= 0.2f * (income -5f);
        }
        else if (income>10.0f) {
            tax+=0.5f* (5.0f -2.5f);
            tax+=0.2f * (10.0f -5f);
            tax+=0.3f * ( income - 10.0f);
        }
        System.out.println("The total tax paid by employee is: "+tax);
    }
}
