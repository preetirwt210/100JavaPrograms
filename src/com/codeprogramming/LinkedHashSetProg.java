package com.codeprogramming;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetProg {
    public static void main(String[] args){
        LinkedHashSet<String> arr=new LinkedHashSet<>();
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
