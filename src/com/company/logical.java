package com.company;

public class logical {
    public static void main(String[] args) {
        System.out.println("logical &&");
        boolean a = true;
        boolean b = false;

        if(a && b) {
            System.out.println("is same ");
        }else System.out.println("is not same");

        if(a || b) {
            System.out.println("|| ke aandar gusa");

        }else
        {
            System.out.println("|| k aandar nai aaya");
        }

        if(a!=b){
            System.out.println("a is not same as b");
        }
    }
}
