package com.codeprogramming;

import javax.management.StandardEmitterMBean;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        int i,temp=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int c=sc.nextInt();
        int[] arr= new int[c];
        System.out.println("Enter " + c +" elements");

        for( i=0;i<c;i++){
            arr[i]= sc.nextInt();

        }
        for(int j=0;j<arr.length;j++){
           System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println("Enter no to find: ");
        int no= sc.nextInt();

        for(int m=0;m<arr.length;m++){
            if(arr[m]==no){
                System.out.println(" Item found at this position: "+ m);
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("Item not found");
        }


    }
}
