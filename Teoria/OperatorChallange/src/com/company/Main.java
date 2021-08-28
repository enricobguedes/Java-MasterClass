package com.company;

public class Main {

    public static void main(String[] args) {
        double myDouble = 20d;
        double myDouble2 = 80d;
        double myDouble100 = (myDouble + myDouble2) * 100d;
        double myRemainder = myDouble100 % 40d;
        boolean masEvdd = (myRemainder == 0) ? true : false;

        System.out.println("Boolean masEvdd = " + masEvdd);
        if (masEvdd == false) {
            System.out.println("Got some remainder: " + myRemainder);
        }

    }
}
