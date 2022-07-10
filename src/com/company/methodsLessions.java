package com.company;

public class methodsLessions {
    static void joke(){
        System.out.println("Police hi chor h");
    }
    static int logic(int x,int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else{
            z=x+y*5;
        }
        return z;
    }
    public static void main(String[] args) {
        System.out.println(logic(10,6));
        joke();
        int [] mark = {77,66,45,78,45};


    }
}
