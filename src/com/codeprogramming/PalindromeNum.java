package com.codeprogramming;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String args[]){
         int rev=0, temp,rem;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any value: ");
        int no=sc.nextInt();
        temp=no;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(no==rev){
            System.out.println("No is a pallindrome no: "+ no);
        }
        else{System.out.println("No is not a palindrome no.");}
    }
}
