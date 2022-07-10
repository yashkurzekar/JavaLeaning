package com.company;

import javax.swing.*;

public class arrayBasiclatest {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,70};
        System.out.println(num.length);
        System.out.println(num[3]);
        System.out.println("printin using for loop");
        for (int i =0;i<num.length;i++){
            System.out.println(num[i]);
        }

        for(int element: num){
            System.out.println(element);
        }
    }
}
