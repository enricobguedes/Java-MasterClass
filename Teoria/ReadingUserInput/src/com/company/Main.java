package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in); // criando instancia do scanner

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt(); // checar se o proximo scanner será uma INTEGER

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt(); // scanner tem um parse para int
            scanner.nextLine(); // manejar caractere de proxima linha

            System.out.println("Enter your name: ");
            String name = scanner.nextLine(); // definindo variavel com o input do console
            int age = 2021 - yearOfBirth;

            if ( age >= 0 && age <=100) {
                System.out.println("Seu nome é " + name + " e a idade é: " + age);
            } else {
                System.out.println(name + ", you are not this age!");
            }
        } else {
            System.out.println("Parameters are wrong.");
        }

        scanner.close(); // lembrar de fechar o scanner
    }
}
