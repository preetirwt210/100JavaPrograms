package com.codeprogramming;

import java.util.Scanner;

public class Compete2String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter 2nd String: ");
        String s2 = sc.nextLine();
        if (s1.compareTo(s2) > 0) {
            System.out.println("S1 is greater than s2");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("S2 is greater than s1");
        } else {
            System.out.println("Both strings are equal");
        }
    }
}
