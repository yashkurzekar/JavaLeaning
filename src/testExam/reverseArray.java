package testExam;

public class reverseArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,};
        int length = array.length;
        for (int i=0;i<length/2;i++){
            int a = array[i];
            array[i]=array[length-1-i];
            array[length-1-i]=a;
        }
        for (int element:array){
            System.out.print(element+" ");
        }
    }
}
