package com.company;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        Scanner input = new Scanner(System.in);
        System.out.printf("Number: ");
        int num = input.nextInt();
        String block = "*";
        while (num > 0) {
            System.out.println(block);
            block += "*";
            num --;
        }
    }
}
