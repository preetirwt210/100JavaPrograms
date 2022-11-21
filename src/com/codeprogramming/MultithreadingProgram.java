package com.codeprogramming;

public class MultithreadingProgram extends Thread {
@Override
public void run(){
    System.out.println("Thread is running successfully!!");
}
    public static void main(String[] args){
        MultithreadingProgram mt=new MultithreadingProgram();
        mt.start();
    }
}
