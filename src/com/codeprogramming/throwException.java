package com.codeprogramming;

import java.util.Scanner;

public class throwException {
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        if(age<18){
            throw new ArithmeticException("Invalid Exception");
        }else{
            System.out.println("Eligible Age");
        }
        System.out.println("Will run anyhow");
    }
}
