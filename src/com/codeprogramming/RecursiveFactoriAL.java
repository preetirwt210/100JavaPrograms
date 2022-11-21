package com.codeprogramming;

import java.util.Scanner;

public class RecursiveFactoriAL {
    int fact(int n) {
        if(n==1 || n==0){
            return 1;
        }
        return n* fact(n-1);
    }

    public static void  main(String[] args){
        RecursiveFactoriAL r=new RecursiveFactoriAL();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no : ");
        int no=sc.nextInt();
      System.out.println("Factorial of no is: " + r.fact(no));
    }
}
