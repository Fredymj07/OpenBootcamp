package org.example;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor digite el nombre de la estación: ");
        String estacion = teclado.next();

        switch (estacion) {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("La estación digitada no existe.");
                break;
        }
    }
}
