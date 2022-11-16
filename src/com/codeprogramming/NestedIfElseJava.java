package com.codeprogramming;

import java.util.Scanner;

public class NestedIfElseJava {
    public static void main(String[] args){
        int passingMarks=33;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Marks: ");
        int marks=sc.nextInt();
        if(marks>=passingMarks){
       if(marks>=90&& marks<=100){
           System.out.println("Grade :A ");
       }else if(marks>=70 && marks<90){
            System.out.println("Grade :B ");
       }else if(marks>=55 && marks<70){
           System.out.println("Grade :C ");
       }else{
           System.out.println("Grade :D ");
       }}else{
           System.out.println("Better luck next time");
       }
    }
}
