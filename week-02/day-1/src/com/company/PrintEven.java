package com.company;

public class PrintEven {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 500) {
            if (i%2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}