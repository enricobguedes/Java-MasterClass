package com.company;

public class Main {

    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer minimun: " + myMinIntValue);
        System.out.println("Integer maximun: " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Integer minimun: " + myMinByteValue);
        System.out.println("Integer maximun: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Integer minimun: " + myMinShortValue);
        System.out.println("Integer maximun: " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Integer minimun: " + myMinLongValue);
        System.out.println("Integer maximun: " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);

        //casting

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        // challenge

        byte myByteVar = (byte) 1;
        short myShortVar = (short) 2;
        int myIntVar = 10;
        long myLongVar = (long) 50000 + 10*(myByteVar + myShortVar + myIntVar);

        System.out.println(myLongVar);
    }
}
