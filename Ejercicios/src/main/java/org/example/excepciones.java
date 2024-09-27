package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excepciones {

    public void control_expeciones(){

        Scanner entrada = new Scanner(System.in);

        int numero;
        boolean error = true;

        while (error==true) {

            try {
                System.out.println("Introduce un numero...");
                numero = entrada.nextInt();
                error = false;
            } catch (InputMismatchException er) {
                System.out.println("ERROR. Introduce un valor válido...");
                entrada.nextLine();


            }
        }
    }
}
