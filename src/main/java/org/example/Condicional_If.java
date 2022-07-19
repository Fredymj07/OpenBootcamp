package org.example;

import java.util.Scanner;

public class Condicional_If {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor ingrese el número que desea validar para conocer si es positivo, negativo o igual a cero: ");
        int numeroIf = teclado.nextInt();

        if (numeroIf > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es igual a cero.");
        }
    }
}
