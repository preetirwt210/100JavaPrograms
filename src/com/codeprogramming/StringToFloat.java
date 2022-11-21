package com.codeprogramming;

public class StringToFloat {
    public static void main(String[] args){
        String s= "240";
        float f=Float.parseFloat(s);
        System.out.println("Before conversion: " );
        System.out.println(s+100);
        System.out.println("After conversion: ");
        System.out.println(f+100);
    }
}
