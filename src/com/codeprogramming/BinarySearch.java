package com.codeprogramming;

import java.util.Scanner;

public class BinarySearch {
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
        int li=0;
        int hi= arr.length-1;
      int mi=(li+hi)/2;
      while(li<=hi){
          if(arr[mi] ==no){
              System.out.println(" Item found at this position: "+ mi);
              break;
          }
          else if(arr[mi]<=no){
              li=mi+1;
//              System.out.println(" Item found at this position: "+ mi);
          }
          else{
              hi=mi-1;
//              System.out.println(" Item found at this position: "+ mi);
          }
          mi=(li+hi)/2;
      }



    }
}
