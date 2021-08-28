package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(0);
        printNumberInWord(-1);
        printNumberInWord(-5);
    }

    public static void printNumberInWord(int number) {
        if (number >= 0) {
            switch (number) {
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("DOIS");
                    break;
                default:
                    System.out.println("Other");
                    break;
            }
        }else {
            switch (number) {
                case -1:
                    System.out.println("MENOS UM");
                    break;
                case -2:
                    System.out.println("MENOS DOIS");
                    break;
                default:
                    System.out.println("Other negative.");
                    break;
            }
        }

    }
}

/*
Write a method called printNumberInWord.
The method has one parameter number which is the whole number.
 The method needs to print "ZERO", "ONE", "TWO", ... "NINE",
  "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
  for any other number including negative numbers. You can use if-else statement
  or switch statement whatever is easier for you.


NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.

NOTE: Do not add main method to solution code.
 */
