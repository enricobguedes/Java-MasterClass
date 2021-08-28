package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char a = 'd';

        switch (a) {
            case 'a':
                System.out.println("legal: " + a);
                break;
            case 'b':
                System.out.println("legal2: " + a);
                break;
            case 'c': case 'd': case 'e':
                System.out.println("legal3: " + a);
                break;
            default:
                System.out.println("errou todos: " + a);
                break;
        }

        /*switch(switchValue) {
            case 1:
                System.out.println("Value vas 1");
                break;
            case 2: case 3: case 4:
                System.out.println("Value was 2 3 or 4");
                System.out.println("Value was" + switchValue);
                break;
            default:
                System.out.println("Não era 1,2,3,4");
                break; 
        }*/

    }
}
