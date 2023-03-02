package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the term : ");
        int term = scanner.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print(num1 + " " + num2);
        for (int i = 2; i <= term; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" "+num3);
        }

    }
}