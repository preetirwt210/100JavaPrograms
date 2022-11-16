package com.codeprogramming;

import java.util.Scanner;

public class PrintUserInput {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter  integer number: ");
        int no= sc.nextInt();
        System.out.println("User input: "+ no);
//        System.out.println();
        sc.nextLine();
        System.out.println("Enter String value: ");
        String n=sc.nextLine();
        System.out.println("User enter value: "+ n);
    }
}
