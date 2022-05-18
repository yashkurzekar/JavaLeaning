package com.company;
/*
  Associativity tells the direction of the execution of operators. It can either be left to right or vice versa.

/ * -> L to R

+ - -> L to R

++, = -> R to L

Here is the precedence and associativity table which makes it easy for you to understand these topics better:



Quick Quiz: How will you write the following expression in Java?


   */
public class Presedance {
    public static void main(String[] args) {
        //Precedence & Associativity Rule
        int a = 6*5-34/2;
        /*
            =30 - 34/2
            =30- 17
            =13
         */
        int b = 60/5-34*2;
        /*
            =12-34*2
            =12-68
            =-54
         */
        System.out.println(a);
        System.out.println(b);

        System.out.println("Quick Quiz");
        int x = 6;
        int y = 1;
        int k = x * y/2;
        System.out.println(k);
    }
}
