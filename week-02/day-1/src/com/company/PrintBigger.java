package com.company;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Number one plz: ");
        int numOne = scanner.nextInt();
        System.out.printf("Number two plz: ");
        int numTwo = scanner.nextInt();
        if (numOne >= numTwo) {
            System.out.println(numOne);
        } else {
            System.out.println(numTwo);
        }
    }
}
