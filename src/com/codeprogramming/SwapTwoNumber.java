package com.codeprogramming;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        a= sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b=sc.nextInt();
        System.out.println("Before swapping: " +a + " " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: "+a + " " + b);

    }
}
