package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /*int newScore = calculateScore("Enrico", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();*/

        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(7,5);
        calcFeetAndInchesToCentimeters(-10, 1);
        calcFeetAndInchesToCentimeters(0, 1);
        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        //validate if first parameter >= 0
        // validade second parameter >=0 and <=12
        // if valid, calculate in centimeters with feet and inches, return cm
        if (feet >= 0 && ((inches <= 12) && (inches >= 0))) {
            double totalInches = (feet * 12) +  inches;
            double totalCm = totalInches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + totalCm + "cm");
            return totalCm;
        }
        System.out.println("Invalid Parameter");
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        // validate if inches is >=0
        //calculate how many feet in inches
        // 1 inch = 2.54 cm 1 feet = 12 inches
        if(inches >= 0) {
            int totalFeet = (int) inches/12;
            int remainingInches = (int) inches%12;
            System.out.println("total feet " + totalFeet + " and " + remainingInches);
            return calcFeetAndInchesToCentimeters(totalFeet, remainingInches);
        }
        return -1;
    }
    /*public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unknown scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player name, no player score points");
        return 0;
    }*/
}
