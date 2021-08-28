package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, -1, 0);
    }
    public static boolean hasEqualSum (int pNum, int sNum, int tNum) {
        int total = tNum;
        int checar = pNum + sNum;
        if (checar == total) {
            System.out.println("Parabens, acertou miserávi! " + pNum + " + " + sNum + " é igual a " + tNum );
            return true;
        }
        System.out.println("tu é burro bicho");
        return false;

    }
}
/*
Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.


EXAMPLES OF INPUT/OUTPUT:

* hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1

* hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2

* hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0


NOTE: The hasEqualSum method  needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
 */
