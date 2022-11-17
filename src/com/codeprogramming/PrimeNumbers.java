package com.codeprogramming;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int no, i;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no: ");
        no = sc.nextInt();
        for (i = 2; i <= no-1; i++) {
            if (no % i == 0) {
//                System.out.println("Prime no: " + no);
                temp=temp+1;
                break;
            }

        }
        if(temp>0){
            System.out.println("Not Prime");
        }
        else{System.out.println("Prime no: " + no);}
    }
}
