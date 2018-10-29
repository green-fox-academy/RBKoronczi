package com.company;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as the number was
        Scanner input = new Scanner(System.in);
        System.out.printf("Number: ");
        int numSide = input.nextInt();
        for (int i = 0; i < numSide; i++) {
            if (i == 0 || i == numSide-1) {     //Felső + Alsó él
                int blocks = numSide;
                while (blocks > 0) {
                    System.out.printf("%%");
                    blocks--;
                }
                System.out.println();
            } else {                            //Oldalak
                int blocks = numSide;
                while (blocks>0) {
                    if (blocks == numSide || blocks == 1) {
                        System.out.printf("%%");
                    } else {
                        System.out.printf(" ");
                    }
                    blocks--;
                }
                System.out.println();
            }
        }
    }
}
