package com.codeprogramming;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram {
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Mangoes");
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Papaya");
        for(int i=0;i<arr.size();i++){
            System.out.println("List using forLoop: "+ arr.get(i));
        }

        Iterator i= arr.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
