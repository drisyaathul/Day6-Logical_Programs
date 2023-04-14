package com.bridgelabz;

import java.util.Scanner;

public class SquareRoot {
    /**
     * Function to find the square root of given no
     * c the value to find square root of
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the non-negative number , c = ");
        double c = scanner.nextDouble();
        //initialize t = c
        double t = c;
        double epsilon = 1e-15;

        while (Math.abs(t - c / t) > epsilon * t) {
                t = (c / t + t) / 2.0;
            }
        System.out.println("The SquareRoot Of c = " +t);
        }
    }
