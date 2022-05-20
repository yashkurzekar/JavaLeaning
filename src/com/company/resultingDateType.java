package com.company;
/*
 Resulting data type after arithmetic operation
Result = byte + short -> integer
Result = short + integer -> integer
Result = long + float -> float
Result = integer + float -> float
Result = character + integer -> integer
Result = character + short -> integer
Result = long + double -> double
Result = float + double -> double
Increment and Decrement operators
a++, ++a (Increment Operators)
a--, --a (Decrement Operators)
These will operate on all data types except Booleans.

Quick Quiz: Try increment and decrement operators on a Java variable

a++ -> first use the value and then increment
++a -> first increment the value then use it
Quick Quiz: What will be the value of the following expression(x).

int y=7;
int x = ++y*8;
value of x?
char a = ‘B’;
a++; (a is not ‘C’)
*/
public class resultingDateType {
    public static void main(String[] args) {
        int a = 5;
        short b = 2;
        byte c = 22;
        int z = a + b;
        float y = 26.4f + 5;

        System.out.println(z);
        System.out.println(y);

        //Increment and Decrement Operations
        System.out.println("Increment and Decrement");
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);

        System.out.println("Exercise Result here");
        int yash = 7;
        int x = (++yash)*8;
        System.out.println("The value of expression is "+ x);
        System.out.println("Character increment");
        char yash1 = 'a';
        System.out.println("After increment a becomes "+ ++yash1);

    }
}
