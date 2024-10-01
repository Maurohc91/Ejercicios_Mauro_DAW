package org.example;

import java.util.Scanner;

public class Multiplica {

    public void Multiplica () {

        int num1 = 111;
        int num2 = 222;

        String numC = Integer.toString(num2);
        String numC_1 = numC.substring(0,1);
        String numC_2 = numC.substring(1,2);
        String numC_3 = numC.substring(2,3);

        int num_1_1 = Integer.parseInt(numC_1);
        int num_1_2 = Integer.parseInt(numC_2);
        int num_1_3 = Integer.parseInt(numC_3);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número de 3 cifras");
        num1 = entrada.nextInt();

        System.out.println("Introduce otro número de 3 cifras");
        num2 = entrada.nextInt();
        int resultado = (num1 * num2);

        System.out.println("El producto de la multiplicación es: " + resultado);
        System.out.println("    " + num1);
        System.out.println("X   " + num2);
        System.out.println("--------");
        System.out.println("    " +num1 * num_1_1);
        System.out.println("   " + num1 * num_1_2 + "x ");
        System.out.println("  " + num1 *num_1_3 +"xx  ");
        System.out.println("--------");
        System.out.println("  " + resultado);



    }
}