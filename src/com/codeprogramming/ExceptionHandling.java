package com.codeprogramming;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int no1= sc.nextInt();
        System.out.println("Enter 2nd no:");
        int n2= sc.nextInt();
        try{
            int result=no1/n2;
            System.out.println("Result is :" + result);

        }catch (Exception e){
            System.out.println(" Exception occured: "+ e);
        }
        finally{
            System.out.println("Finally block will run any how");
        }
    }
}
