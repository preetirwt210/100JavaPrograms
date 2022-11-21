package com.codeprogramming;

public class OpenNotepad {
    public static void main(String[] args){
        Runtime rs=Runtime.getRuntime();
        try{
            rs.exec("notepad");
        }
        catch (Exception e){
            System.out.println("Exception is: "+ e);

        }
    }
}
