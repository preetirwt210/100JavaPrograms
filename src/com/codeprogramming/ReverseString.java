package com.codeprogramming;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String value: ");
        String s1=sc.nextLine();
        String rev="";
        int len=s1.length();
        for(int i=len-1;i>=0;i--){
             rev= rev+ s1.charAt(i);
        }
        System.out.println(rev);
    }
}
