package org.example;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class positivonegativo {

    public void posneg() {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime un número");
        int numero = entrada.nextInt();
        if (numero > 0)
            System.out.println("El numero es positivo");
        else if (numero < 0)
            System.out.println("El numero es negativo");
        else
            System.out.println("El numero es cero");


    }

    public void noigual() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num1 = entrada.nextInt();

        System.out.println("Introduce otro numero");

        int num2 = entrada.nextInt();

        if (num1 < num2)
            System.out.println("El segundo numero es mayor");

        else if (num1 == num2)
            System.out.println("ERROR: los números introducidos son iguales");

        else
            System.out.println("El primer numero es mayor");

    }


    public void dividirentrecero() {

        Scanner entrada = new Scanner(System.in);

        float num1 = 0;
        float num2 = 0;
        float resultado = 0;
        int aux = 0;

        while (aux == 0) {
            try {
                System.out.println("Introduce el dividendo");
                num1 = entrada.nextInt();
                System.out.println("Introduce el divisor");
                num2 = entrada.nextInt();
                aux = 1;

            } catch (InputMismatchException er) {

                System.out.println("ERROR. Intorduce un valor válido");
                entrada.nextLine();
            }

        }
        if (num2 == 0) {
            System.out.println("El divisor no puede ser 0.");

        } else {
            resultado = (num1 / num2);
            System.out.println("El resultado es " + resultado);
        }
    }

    public void area() {

        Scanner entrada = new Scanner(System.in);
        float b = 0;
        float h = 0;
        float resultado = 0;
        int aux = 0;


        while (aux == 0) {
            try {
                System.out.println("Introduce la base");
                b = entrada.nextInt();
                System.out.println("Introduce la altura");
                h = entrada.nextInt();
                aux = 1;
            } catch (InputMismatchException er) {
                System.out.println("ERROR. Introduce un valor valido");
                entrada.nextLine();

            } 

            if (b < 0) {
                System.out.println("El valor de la base tiene que ser positivo");
            }
            if (h < 0) {
                System.out.println("El valor de la altura tiene que ser positivo");


            } else {
                resultado = ((h * b) / 2);
                System.out.println("El resultado es " + resultado);


            }
        }
    }
}






