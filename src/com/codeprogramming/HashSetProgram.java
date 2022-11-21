package com.codeprogramming;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetProgram {
    public static void main(String[] args){
        HashSet<String> arr=new HashSet<>();
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
