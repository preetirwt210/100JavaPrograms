package com.codeprogramming;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args){
        //5=5*4*3*2*1
        int fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number : ");
        int no=sc.nextInt();

            for (int i = 1; i <= no; i++) {

                fact = fact * i;
                System.out.println(fact);
            }
        }

}
