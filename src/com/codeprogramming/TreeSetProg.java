package com.codeprogramming;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetProg {
    public static void main(String[] args){
        TreeSet<String> arr=new TreeSet<>();
        arr.add("Mangoes");
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Papaya");
        for(String e: arr){
            System.out.println(e);
        }

        Iterator<String> i= arr.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
