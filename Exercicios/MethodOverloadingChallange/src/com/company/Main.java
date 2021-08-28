package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getDurationString(3600,0);
        getDurationString(125,42);
        getDurationString(50);
        getDurationString(3600);
        getDurationString(5);


    }
    public static int getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && ((seconds >= 0 && seconds <= 60))) {
            int XX = minutes / 60;
            int YY = minutes - (60 * XX);
            int ZZ = seconds;
            return getDurationString(XX,YY,ZZ);
        }
            System.out.println("Invalid value");
            return -1;
    } // receber em minutos e segundos, transformar em horas minutos e segundos
    public static int getDurationString(int seconds) {
        if (seconds >= 0) {
            if (seconds >= 60) {
                int minutes = seconds / 60;
                seconds = seconds - (60 * minutes);
                return getDurationString(minutes, seconds);
            }
            return getDurationString(0,seconds);
        }
        System.out.println("Invalid value");
        return -1;
    } // receber em segundos, transformar em minutos e segundos
    public static int getDurationString(int hours, int minutes, int seconds) { // formatar para o horario certo
        //formatar os dados para sair 00h 00m 00s
        if ((hours != 0) || (minutes !=0) || (seconds != 0)) {
            System.out.printf("%02dh %02dm %02ds\n", hours,minutes,seconds);
        }
        return -1;
    }
}

