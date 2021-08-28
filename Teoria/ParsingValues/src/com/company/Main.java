package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numeroString = "2018";
        //tomar cuidado com exceptions de colocar uma letra.
        //existem outras maneiras para lidar com isso.
        int numeroInt = Integer.parseInt(numeroString);
        System.out.println(numeroInt);

        String doubleString = "2018";
        double doubleNumero = Double.parseDouble(doubleString);
        System.out.println(doubleNumero);

        //Lembrando que concatenar um numero a string adiciona
        // o numero no final dela
        numeroString += 1;
        System.out.println(numeroString);
    }
}
