package com.codeprogramming;

import java.util.Scanner;

public class SwapTwoNumberThirdVar {
    public static void main(String[] args){

        int temp, a, b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        a= sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b= sc.nextInt();
        System.out.println("Before swapping: " + a + " " + b);
            temp=a;
            a=b;
            b=temp;

        System.out.println("Swapping of number is done: " + a +" "+ b);

    }
}
