package com.codeprogramming;

public class StaticAndInstance {
    public static void main(String[] args){
               showMessage();
               StaticAndInstance s=new StaticAndInstance();
               s.showNothing();
    }
    public static void showMessage(){
        System.out.println(" Static method is called");
    }

    public void showNothing(){
        System.out.println("Instance method");
    }
}
