package com.codeprogramming;

public class ComapreTwoStrings {
    public static void main(String[] args){
        String s1="Preeti";
        String s2="Qreeti";
        String s3="PREETI";
        String s4="Preeti";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s2.compareTo(s3));
        System.out.println(s2.compareTo(s4));
    }
}
