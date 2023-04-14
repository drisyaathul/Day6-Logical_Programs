package com.bridgelabz;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit value : ");
        float fahrenheit = scanner.nextFloat();

        float celsius = (fahrenheit-32)*5/9;
        System.out.println("The Celsius Value is "+celsius);
    }
}
