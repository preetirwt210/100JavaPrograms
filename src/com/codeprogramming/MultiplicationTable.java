package com.codeprogramming;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no:");
        int no= sc.nextInt();
System.out.println("Multiplication table of " + no);
        for(int i=1;i<=10;i++){
            int mul= no* i;
            System.out.println(no + "*" + i+ "= " + mul);
        }
    }
}
