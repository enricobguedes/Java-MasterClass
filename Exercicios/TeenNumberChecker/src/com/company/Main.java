package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        hasTeen(9, 99, 19);
        hasTeen(23, 15, 42);
        hasTeen(22, 23, 34);
    }
    public static boolean hasTeen (int num1, int num2, int num3){
        int pNum = 0, sNum = 0, tNum = 0;

            if (num1 >=13 && num1 <= 19) {
                pNum= num1;

            }else if (num2 >= 13 && num2 <= 19) {
                sNum= num2;

            }else if(num3 >= 13 && num3 <= 19){
                tNum= num3;

            }else{
                System.out.println("Não tem numero ...." + num1 + " " + num2 + " " + num3);
                return false;
            }
            if (pNum != 0) {
                System.out.println("O correto é " +pNum);
                return true;
            } else if(sNum!=0){
                System.out.println("O correto é " + sNum);
                return true;
            } else if(tNum!=0){
                System.out.println("O correto é " + tNum);
                return true;
            }

            return false;
    }
}
/*
We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

Write a method named hasTeen with 3 parameters of type int.

The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive).
 Otherwise return false.


EXAMPLES OF INPUT/OUTPUT:

* hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19

* hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19

* hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19


Write another method named isTeen with 1 parameter of type int.

The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive).
Otherwise return false.

EXAMPLES OF INPUT/OUTPUT:

* isTeen(9);  should return false since 9 is in not range 13 - 19

* isTeen(13);  should return true since 13 is in range 13 - 19

NOTE: All methods need to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
 */