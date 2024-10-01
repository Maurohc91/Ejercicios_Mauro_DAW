package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Votacion {

    public void Votacion() {

        int edad = -1;
        int aux = -4;
        String nombre = "";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime tu nombre");
        nombre = entrada.next();
        while (edad < 0) {
            try {


                System.out.println("Hola " + nombre + ". Introduce tu edad");
                edad = entrada.nextInt();
                aux = 18;
                if (edad >= 18) {
                    System.out.println("Enhorabuena " + nombre + ". Puedes votar");

                }
                else if (edad < 0) {
                    System.out.println("ERROR. Intorduce un valor válido");
                    entrada.nextLine();
                }

                else  {
                    System.out.println("Lo siento " + nombre + ". Te faltan " + (18 - edad) + " años para votar");
                }







            } catch (InputMismatchException er) {
                System.out.println("ERROR. Intorduce un valor válido");
                entrada.nextLine();
            }

        } entrada.close();

    }
}
