package com.codeprogramming;

public class StringToLong {
    public static void main(String[] args){
        String s= "240";
        long l=Long.parseLong(s);
        System.out.println("Before conversion: " );
        System.out.println(s+100);
        System.out.println("After conversion: ");
        System.out.println(l+100);
    }
}
