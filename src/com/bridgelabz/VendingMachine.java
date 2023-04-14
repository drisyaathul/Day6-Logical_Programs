package com.bridgelabz;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Amount returned by the Vending Machine : ");
        int amount = scanner.nextInt();

        while (amount > 0){

            if (amount>=1000){
                System.out.println("Number of 1000rs Note = "+(amount/1000));
                amount = amount % 1000;
            } else if (amount>=500) {
                System.out.println("Number of 500rs Note = "+(amount/500));
                amount = amount % 500;
            } else if (amount>=100) {
                System.out.println("Number of 100rs Note = "+(amount/100));
                amount = amount % 100;
            } else if (amount>=50) {
                System.out.println("Number of 50rs Note = "+(amount/50));
                amount = amount % 50;
            } else if (amount>=10) {
                System.out.println("Number of 10rs Note = "+(amount/10));
                amount = amount % 10;
            } else if (amount>=5) {
                System.out.println("Number of 5rs Note = "+(amount/5));
                amount = amount % 5;
            } else if (amount>=2) {
                System.out.println("Number of 2rs Note = "+(amount/2));
                amount = amount % 2;
            }else if (amount>=1) {
                System.out.println("Number of 1rs Note = "+(amount/1));
                amount = amount % 1;
            }
        }
    }
}
