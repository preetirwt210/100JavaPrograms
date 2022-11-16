package com.codeprogramming;

public class ForEachLoop {
    public static void main(String[] args){
        int[] arr={100,56,23,55,78,64};
          String[] name={"preeti","priya","nitesh","happy","hirab"};
        System.out.println(" Integer list is:");
        for(int a: arr){
            System.out.print(" "+a);
        }
        System.out.println();
        System.out.println("String list is: ");
        for (String n: name){
            System.out.print(" " +n);
        }
    }
}
