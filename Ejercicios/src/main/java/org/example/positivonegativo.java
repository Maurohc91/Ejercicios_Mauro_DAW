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

            // Leer la base del triángulo
            System.out.println("Introduce la base del triángulo: ");
            int base = entrada.nextInt();

            // Leer la altura del triángulo
            System.out.println("Introduce la altura del triángulo: ");
            int altura = entrada.nextInt();

            // Comprobar si algún valor es negativo
            if (base < 0 || altura < 0) {
                System.out.println("ERROR, Numero negativo");
            } else {
                // Calcular el área del triángulo
                double area = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + area);
            }

            entrada.close();
        }

    public void MinimoDeTresNumeros(){


        Scanner entrada = new Scanner(System.in);

        // Leer tres números desde el teclado
        System.out.println("Introduce el primer número: ");
        int num1 = entrada.nextInt();

        System.out.println("Introduce el segundo número: ");
        int num2 = entrada.nextInt();

        System.out.println("Introduce el tercer número: ");
        int num3 = entrada.nextInt();

        // Comprobar si alguno de los números es igual
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("ERROR: hay números introducidos que son iguales");
        } else {
            // Encontrar el mínimo de los tres números
            int minimo = Math.min(num1, Math.min(num2, num3));
            System.out.println("El mínimo de los tres números es: " + minimo);
        }

        entrada.close();
    }

    public void IrAComprar(){


                Scanner entrada = new Scanner(System.in);

                // Preguntar si tiene tomate
                System.out.println("¿Tienes tomate? (si/no): ");
                String tieneTomate = entrada.nextLine().toLowerCase();

                // Preguntar si tiene aceite
                System.out.println("¿Tienes aceite? (si/no): ");
                String tieneAceite = entrada.nextLine().toLowerCase();

                // Preguntar si tiene jamón
                System.out.println("¿Tienes jamón? (si/no): ");
                String tieneJamon = entrada.nextLine().toLowerCase();

                // Verificar si falta algún ingrediente
                if (tieneTomate.equals("no") || tieneAceite.equals("no") || tieneJamon.equals("no")) {
                    System.out.println("¡Tenemos que ir a comprar!");
                } else {
                    System.out.println("¡No tenemos que ir a comprar!");
                }

                entrada.close();
            }
        }












