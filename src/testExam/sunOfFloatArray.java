package testExam;

public class sunOfFloatArray {
    public static void main(String[] args) {
        float [] marks = {76.6f,36.5f,89.5f,49.5f,98f};
        float sum = 0;
        for (float element:marks){
            sum+=element;
        }
        System.out.println("The value of sum is "+sum);
    }
}
