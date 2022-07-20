package org.open_bootcamp;

public class App {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(32);
        persona.setNombre("Fredy");
        persona.setTelefono("3118750790");
        System.out.println("Los datos de la persona son los siguientes:");
        System.out.println("El nombre de la persona es -> " + persona.getNombre());
        System.out.println("Edad -> " + persona.getEdad());
        System.out.println("Teléfono -> " + persona.getTelefono());
    }
}
