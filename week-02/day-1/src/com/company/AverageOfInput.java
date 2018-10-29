package com.company;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Integer 1: ");
        int numberOne = scanner.nextInt();
        System.out.printf("Integer 2: ");
        int numberTwo = scanner.nextInt();
        System.out.printf("Integer 3: ");
        int numberThree = scanner.nextInt();
        System.out.printf("Integer 4: ");
        int numberFour = scanner.nextInt();
        System.out.printf("Integer 5: ");
        int numberFive = scanner.nextInt();
        int sum = numberOne + numberTwo + numberThree + numberFour + numberFive;
        double avg = sum / 5;
        System.out.printf("Sum: " + sum + ", " + "Average: "+ avg);
    }
}
