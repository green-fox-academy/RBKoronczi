package com.company;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Kilometers: ");
        int kilometer = scanner.nextInt();
        System.out.println("Miles: "+kilometer*1.609344);
    }
}
