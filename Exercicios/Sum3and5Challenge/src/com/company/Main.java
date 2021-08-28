package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        int contador = 0;

        for(int i = 1; i <= 1000; i++){
            int isDivisableBy3 = i % 3;
            int isDivisableBy5 = i % 5;
            if (contador <= 4) {
                if (isDivisableBy3 == 0 && isDivisableBy5 == 0) {
                    System.out.println("numero divisivel por 3 e 5: " + i);
                    sum = sum + i;
                    System.out.println("total: " + sum + "\n");
                    contador ++;
                }
            } else {
                break;
            }

        }
    }

}
