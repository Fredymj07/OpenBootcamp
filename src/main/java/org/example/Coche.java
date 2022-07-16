package org.example;

public class Coche {

    private int numeroPuertas = 3;

    public int incrementarNumeroPuertas() {
        return this.numeroPuertas += 1;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        System.out.println(miCoche.incrementarNumeroPuertas());
    }
}
