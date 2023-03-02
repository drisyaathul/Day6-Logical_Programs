package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = scanner.nextInt();
        int reverse = 0;

        for(int i=0; num>=1; i++) {
            i = num % 10;
            reverse = reverse * 10 + i;
            num = num / 10;
        }
            System.out.println("Reverse Number = "+reverse);
    }
}
