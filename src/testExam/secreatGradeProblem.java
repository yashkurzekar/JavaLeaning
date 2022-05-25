package testExam;
/*
Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
 */
public class secreatGradeProblem {
    public static void main(String[] args) {
        System.out.println("what is your grade");
        char a = 'B';
        a = (char)(a +8);
        System.out.println(a);

        //decryption
        System.out.println("your Grade is ");
        a = (char)(a - 8);
        System.out.println(a);
        System.out.println("THANK YOU");
    }
}
