package com.company;

public class Main {

    public static void main(String[] args) {
	// lembrar de usar f/d
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3f;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // challenge

        double myPounds = 200d;
        double myTotalKg = 0.45359237 * myPounds;
        System.out.println(myTotalKg);

    }
}
