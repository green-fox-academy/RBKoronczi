package com.company;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was
        Scanner input = new Scanner(System.in);
        System.out.printf("Number: ");
        int lineNum = input.nextInt();
        int numTab;
        int numChar;



        for (int i=0; i<lineNum; i++) {

            if (i*2 < lineNum){                        //Felső fele
                numTab = (lineNum-(lineNum/2)-i);
                numChar = 1 + 2*i;

            } else if(lineNum%2 == 0) {
                numTab = (i-lineNum/2);
                numChar = 2*(lineNum-i)+1;
            }
            else {                                    //Alsó fele
                numTab = (i-lineNum/2)+1;
                numChar = 2*(lineNum-i)-1;

            }
            //System.out.println(numTab + " " + numChar); //Debugger
            while (numTab>0){
                    System.out.printf(" ");
                    numTab--;
            }
            while (numChar>0){
                System.out.printf("*");
                numChar--;
            }
            System.out.println();
            }
        }
    }

