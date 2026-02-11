package org.example;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setEdad(25);
        persona1.setGenero("Masculino");

        Persona persona2 = new Persona("Maria", 30, "Femenino");

        Persona.mostrarInformacion(persona1);
        System.out.println("-----------");
        Persona.mostrarInformacion(persona2);
    }
}

class Persona {
    // Atributos
    String nombre;
    int edad;
    String genero;

    // Constructor vacio
    public Persona() {
    }

    // Constructor con parametros
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Metodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Metodo para mostrar información
    static void mostrarInformacion(Persona p) {
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Genero: " + p.getGenero());
    }
}
