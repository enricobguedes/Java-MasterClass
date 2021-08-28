package com.company;



public class Main {

    public static void main(String[] args) {
	printConversion(1.5);
	double chato = toMilesPerHour(1);
	System.out.println(chato);
    }

        // write your code here
        public static double toMilesPerHour (double kilometersPerHour) {
            double converted = 0;
            if (kilometersPerHour > 0) {
                converted = kilometersPerHour / 1.609;
                long milesPerHour = Math.round(converted);
                return milesPerHour;
            }
            return -1;
        }
        public static void printConversion (double kilometersPerHour) {
            double XX = kilometersPerHour;
            double ZZ = kilometersPerHour / 1.609;
            double YY = Math.round(ZZ);
            if (kilometersPerHour > 0) {
                System.out.println(XX + "km/h = " + YY + "mi/h");
        }
    }
}
