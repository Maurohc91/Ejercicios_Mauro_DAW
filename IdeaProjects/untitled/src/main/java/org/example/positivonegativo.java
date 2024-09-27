package org.example;

import javax.swing.*;
import java.util.Scanner;

public class positivonegativo   {

    public void posneg () {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime un número");
        int numero = entrada.nextInt();
        if (numero > 0)
        System.out.println("El numero es positivo");
        else if (numero < 0 )
        System.out.println("El numero es negativo");
        else
            System.out.println("El numero es cero");



}

    public void noigual (){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num1 = sc.nextInt();

        System.out.println("Introduce otro numero");

        int num2 = sc.nextInt();

            if (num1 < num2)
                System.out.println("El segundo numero es mayor");

            else if (num1 == num2)
                System.out.println("ERROR: los números introducidos son iguales");

            else
            System.out.println("El primer numero es mayor");

            }



    public void dividirentrecero(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int dividendo = sc.nextInt();

        System.out.println("Introduce otro numero");

        int divisor = sc.nextInt();

        if (divisor == 0)
            System.out.println("ERROR. No se puede dividir entre 0");

        else
            System.out.println("El resultado es " + (dividendo / divisor));


    }

    public void area(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la variable b");
        int b = sc.nextInt();
        while (b < 0) {

                System.out.println("El valor de la base tiene que ser positivo");


        System.out.println("Introduce la variable h");
        int h = sc.nextInt();
            if (h < 0)
                System.out.println("El valor de la altura tiene que ser positivo");


    }
}


