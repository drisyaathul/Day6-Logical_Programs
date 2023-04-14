package com.bridgelabz;

import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Decimal Number : ");
        int number = scanner.nextInt();

        // counter for binary array
        int binaryNumber = 0;
        int count = 0;
        while (number != 0)
        {
            int rem = number % 2;
            double c = Math.pow(10, count);
            binaryNumber += rem * c;
            number /= 2;

            // Count used to store exponent value
            count++;

        }
        System.out.println("Decimal to Binary Number : "+binaryNumber);
    }
}
