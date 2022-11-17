package com.codeprogramming;

import java.util.Scanner;

public class SubstringJava {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String: ");
        String s1=sc.nextLine();

        System.out.println("SubString of string from index 2 to last index: " + s1.substring(2,s1.length()));
        System.out.println("SubString of string from index 2 : " + s1.substring(2));
    }
}
