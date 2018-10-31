package com.company;

import java.util.Scanner;

public class DrawChessTable {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Number of Rows");
            int rows = scanner.nextInt();
            System.out.printf("Number of Columns");
            int columns = scanner.nextInt();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if ((i+j)%2 == 0) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}
