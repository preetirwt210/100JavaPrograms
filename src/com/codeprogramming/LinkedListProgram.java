package com.codeprogramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram {
    public static void main(String[] args){
        LinkedList<String> arr=new LinkedList<>();
        arr.add("Mangoes");
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Papaya");
        for(int i=0;i<arr.size();i++){
            System.out.println("List using forLoop: "+ arr.get(i));
        }

        Iterator<String> i= arr.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
