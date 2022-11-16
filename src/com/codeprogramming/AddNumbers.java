package com.codeprogramming;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args){
         int a,b, sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextInt();
        System.out.println("Enter b:");
        b=sc.nextInt();
         sum=a+b;
         System.out.println("Sum is :"+ sum);
    }
}
