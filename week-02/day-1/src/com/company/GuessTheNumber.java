package com.company;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8
        Scanner input = new Scanner(System.in);
        int number = 8;
        System.out.println("Guess the number!");
        int guess = 0;
        while (guess != number) {
            guess = input.nextInt();
            if (guess > number) {
                System.out.println("The stored number is lower");
            } else if (guess < number) {
                System.out.println("The stored number is higher");
            } else {
                System.out.println("You found the number: "+number);
            }
        }
    }
}
