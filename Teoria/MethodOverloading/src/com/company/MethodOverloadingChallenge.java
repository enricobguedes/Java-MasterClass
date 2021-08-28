package com.company;

public class MethodOverloadingChallenge {

    public static void Main (String[] args) {
        getDurationString(80,0);
    }

    public static int getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && ((seconds >= 0 && seconds <= 60))) {
            int XX = minutes / 60;
            int YY = minutes;
                if (minutes % 60 != 0){
                    minutes += (minutes % 60) * 60;
                }
            int ZZ = seconds;
            System.out.println(XX + "h " + YY + "m " + ZZ + "s");
            return 1;
        }
        System.out.println("Invalid value");
        return -1;
    }
}
