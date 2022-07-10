package testExam;
import java.util.Scanner;
public class numberIsPresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] num = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("Enter the element to find");
        int ishere = sc.nextInt();
        boolean ispresent = false;
        for (int element:num){
            if (element==ishere){
                ispresent = true;
                break;
            }
        }
        if (ispresent){
            System.out.println("The value is present in the array");
        }
        else {
            System.out.println("The value is not present in the array");
        }
    }
}
