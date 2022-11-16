package com.codeprogramming;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num to check whether it is even or odd: ");
        int no=sc.nextInt();
        if(no%2==0){
            System.out.println("Number is even");
        }else
            System.out.println("Number is odd");
    }
}
