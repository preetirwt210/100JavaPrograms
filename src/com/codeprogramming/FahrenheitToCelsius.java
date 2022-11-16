package com.codeprogramming;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args ){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter temperature in Fahrenheit: ");
        float fahTemperature= sc.nextFloat();
        float celTemperature= ((fahTemperature-32)*5)/9;
        System.out.println("Fahrenheit to celsius: " + celTemperature );

    }
}
