package com.codeprogramming;

import javax.security.sasl.SaslServer;
import java.util.Scanner;

public class SimpleWhileLoop {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no");
        int no;
//        int no=sc.nextInt();
        while((no=sc.nextInt())!=0){
            System.out.println("No is: "+ no + "- Inside Loop");
            break;
        }
        System.out.println(" Out of loop");
    }
}
