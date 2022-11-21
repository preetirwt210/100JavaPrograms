package com.codeprogramming;

import java.sql.Date;

public class StringToDate {
    public static void main(String[] args){
        String date="2022-11-18";
        Date d=Date.valueOf(date);
        System.out.println(d);
    }
}
