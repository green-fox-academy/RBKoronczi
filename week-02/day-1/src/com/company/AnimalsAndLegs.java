package com.company;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Number of chickens: ");
        int chickens = scanner.nextInt();
        System.out.printf("Number of pigs: ");
        int pigs = scanner.nextInt();
        System.out.println("Number of legs: " + (chickens*2 + pigs*4));
    }
}
