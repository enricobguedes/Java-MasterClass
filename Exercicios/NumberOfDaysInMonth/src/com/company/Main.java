package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getDaysInMonth(1, 2021);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);
    }

    public static int isLeapYear(int year) {
            int isYearDivisebleBy4 = year % 4;
            int isYearDivisebleBy100 = year % 100;
            int isYearDivisableBy400 = year % 400;

            if ((isYearDivisebleBy4 == 0) && (isYearDivisebleBy100 != 0) || (isYearDivisableBy400 == 0)) {
                return 1;
            } else {
                return -1;
            }
        }

    public static int getDaysInMonth (int month, int year) {
        if ((month < 1) || (month > 12) || ((year < 1) || (year > 9999))) {
            System.out.println("Check parameters!");
            return -1;
        }
        int isLeapYear = isLeapYear(year);
        if (isLeapYear == 1) {
            switch (month) {
                case 1:
                    System.out.println("January has 31 days and " + year + " is a leap year!");
                    break;
                case 2:
                    System.out.println("February has 29 days and " + year + " is a leap year!");
                    break;
                default:
                    System.out.println("March, April, June, July, August, September, October, November" +
                            "december and " + year + "is a leap year!");
            }
        } else {
            switch (month) {
                case 1:
                    System.out.println("January has 31 days and " + year + " is not a leap year!");
                    break;

                }
            }

        return -1;
    }
}
/*

​NOTE:  The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method. You can use that solution if you wish.

Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.

If parameter month is < 1 or > 12 return -1. ​
If parameter year is < 1 or > 9999 then return -1.

This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).

You should check if the year is a leap year using the method isLeapYear described above.

Examples of input/output:

* getDaysInMonth(1, 2020); → should return 31 since January has 31 days.

* getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.

* getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.

* getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.

* getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.


HINT: Use the switch statement.

NOTE: Methods isLeapYear and getDaysInMonth need to be public static like we have been doing so far in the course.

NOTE: Do not add a main method to solution code.
 */
