package com.codeprogramming;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
    String rev="";
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter string value");
    String name= sc.nextLine();
    String temp=name;
    int len=temp.length();
    for(int i=len-1;i>=0;i--){
        rev=rev+ temp.charAt(i);
    }
    if(name.equals(rev)){
        System.out.println("It is a palindrome value");
    }else{
        System.out.println("Not a palindrome value");
    }
    }
}
