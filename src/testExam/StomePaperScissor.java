package testExam;
import java.util.Random;
import java.util.Scanner;
public class StomePaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int i=0;
        while( i!=5){
            System.out.println("Enter 1 for stone");
            System.out.println("Enter 2 for Paper");
            System.out.println("Enter 3 for Scisser");

            int computer = ran.nextInt(3)+1;
            byte input = sc.nextByte();
            if((computer==input)){
                System.out.println("Its a Tie, Please play again");
            }
            if (input<=0 || input>3) {
                System.out.println("Wrong input, Please run program again");
                break;
            }
            if (input == 1 && computer == 0 || input == 2 && computer == 1 || input == 0 && computer == 2) {
                System.out.println("you win");
            }
            else if (input == 0 && computer == 0 || input == 1 && computer == 1 || input == 2 && computer == 2) {
                System.out.println("draw");
            }
            else System.out.println("computer win");
            }
            i++;
        }

    }
