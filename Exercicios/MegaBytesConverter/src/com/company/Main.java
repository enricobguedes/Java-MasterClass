package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int XX = kiloBytes;
        if (XX != 0 && kiloBytes > 0 ) {
            int YY = kiloBytes / 1024;
            if (kiloBytes % 1024 != 0) {
                int ZZ = kiloBytes % 1024;
                System.out.println(XX + " KB = " + YY +" MB and " + ZZ + " KB");
            } else {
                System.out.println(XX + " KB = " + YY +" MB");
            }
        }else {
            System.out.println("Invalid Value");
        }
    }
}

/*Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.

The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

XX represents the original value kiloBytes.
YY represents the calculated megabytes.
ZZ represents the calculated remaining kilobytes.

For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"

If the parameter kiloBytes is less than 0 then print the text "Invalid Value".


EXAMPLE INPUT/OUTPUT

* printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB = 2 MB and 452 KB"

* printMegaBytesAndKiloBytes(-1024); → should print the following text: "Invalid Value" because parameter is less than 0.

* printMegaBytesAndKiloBytes(5000); → should print the following text: "5000 KB = 4 MB and 904 KB"


TIP: Be extremely careful about spaces in the printed message.

TIP: Use the remainder operator

TIP: 1 MB = 1024 KB

NOTE: Do not set kilobytes parameter value inside your method. */
