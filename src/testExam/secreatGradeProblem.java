package testExam;

public class secreatGradeProblem {
    public static void main(String[] args) {
        System.out.println("what is your grade");
        char a = 'A';
        a = (char)(a +8);
        System.out.println(a);

        //decryption
        System.out.println("your Grade is ");
        a = (char)(a - 8);
        System.out.println(a);
    }
}
