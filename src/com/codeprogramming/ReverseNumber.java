package com.codeprogramming;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        int rev=0,rem,no;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no:");
        no=sc.nextInt();
        while(no!=0){
            rem=no%10;
            rev=rev * 10 + rem;
            no=no/10;
        }
        System.out.println("Reverse is = " + rev);
    }
}
