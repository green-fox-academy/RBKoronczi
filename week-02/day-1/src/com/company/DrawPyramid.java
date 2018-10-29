package com.company;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        Scanner input = new Scanner(System.in);
        System.out.printf("Number: ");
        int num = input.nextInt();
        int i = 1;

        String block = "*";

        while (i < num) {
            String tab = "";
            for (int tabNum = 0; tabNum <= (num-i); tabNum++) {
                tab += " ";
            }
            System.out.println(tab + block + tab);
            block += "**";
            i++;
        }
    }
}
