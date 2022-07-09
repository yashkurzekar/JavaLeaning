package testExam;
import java.util.Scanner;
public class leapYear {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        long year;
        System.out.println("Enter the year you want");

        year = sc.nextLong();



        if((((year % 100) == 0) && ((year % 400) == 0)) || (((year % 100) != 0) && ((year % 4) == 0))) {
            System.out.println("Yes,this year is an leap year!");
        }



        else{
            System.out.println("No,this year is not a leap year!");
        }
    }
}
