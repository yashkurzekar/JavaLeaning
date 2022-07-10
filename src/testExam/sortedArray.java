package testExam;

public class sortedArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,44,77,88,};
        boolean isSorted = true;
        for (int i =0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted)
        System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");
    }
}
