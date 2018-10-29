package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ParametricAverage {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Number of integers: ");
        int numInt = input.nextInt();
        int count = numInt;
        int counter = 0;
        System.out.println();
        while (count > 0) {
            System.out.printf("Add Number: ");
            counter += input.nextInt();
            count--;
        }
        System.out.println("Sum: " + counter + " " + "Average: " + (counter/numInt));
    }
}
