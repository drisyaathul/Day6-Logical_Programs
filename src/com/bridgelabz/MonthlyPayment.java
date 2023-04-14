package com.bridgelabz;

import java.util.Scanner;

public class MonthlyPayment {
    /**
     * to calculate monthly payment for r interest and p principal for y years
     *  p the principal amount given
     *  y the year for which p is given
     *  r the rate at which p is given
     *  monthly payment
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Principle : ");
        double p = scanner.nextInt();
        System.out.println("Enter the Year : ");
        double y = scanner.nextInt();
        System.out.println("Enter the Rate : ");
        double r = scanner.nextInt();

        double n = 12 * y;
        double r0 = r / (12 * 100);

        double payment = p * r0 / (1 - Math.pow((1+r0), -n));
        System.out.println(payment);

    }
}
