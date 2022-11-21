package com.codeprogramming;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatProg {

    public static void main(String[] args){

        Date d= new Date();
        System.out.println("All Date formats");
        SimpleDateFormat sd=new SimpleDateFormat("MM/dd/YYYY");
        String str1=sd.format(d);
         System.out.println("SimpleDateFormat in MM/dd/YYYY : "+ str1);

         sd=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
         String str2=sd.format(d);
         System.out.println("SimpleDateFormat in MM/dd/yyy hh:mm:ss : "+ str2);

         


    }
}
