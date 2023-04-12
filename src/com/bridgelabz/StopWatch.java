package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number to start : ");
        long start = scanner.nextLong();
        start = System.currentTimeMillis();
        System.out.print("Enter any number to stop : ");
        long stop = scanner.nextLong();
        stop = System.currentTimeMillis();

//Measure the elapsed time between start and end
        long difference = stop - start;
        long mils = difference % 1000;

        System.out.println("Elapsed time : " + mils + " m secs");

    }
}
