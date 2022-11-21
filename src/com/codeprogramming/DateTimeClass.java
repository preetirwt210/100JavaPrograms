package com.codeprogramming;

import java.sql.Date;

public class DateTimeClass {
    public static void main(String[] args){
        long millis=System.currentTimeMillis();
        Date d= new Date(millis);
        System.out.println(d);
    }
}
