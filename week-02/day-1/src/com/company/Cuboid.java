package com.company;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        double a, b, c;
        a = 10;
        b = 5;
        c = 2;
        double A = 2*(a*b + a*c + b*c);
        double V = (a*b*c);
        System.out.println("Surface Area: "+A);
        System.out.println("Volume: "+V);
    }
}
