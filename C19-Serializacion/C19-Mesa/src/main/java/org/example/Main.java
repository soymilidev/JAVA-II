package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contacto> contactos = new ArrayList<>();
        contactos.add(new Contacto("Maria", "Lopez", "maria.gonzalez@gmail.com", "1234567890"));
        contactos.add(new Contacto("Carlos", "Martinez", "carlos.rodriguez@gmail.com", "9876543210"));
        contactos.add(new Contacto("Ana", "Santos", "ana.silva@gmail.com", "1112223333"));
        contactos.add(new Contacto("Juan", "Garcia", "juan.torres@gmail.com", "9876543210"));
        contactos.add(new Contacto("Luisa", "Fernandez", "luisa.lopez@gmail.com", "1234567890"));

        ManejoDeArchivos.guardarArchivo(contactos);
        ManejoDeArchivos.recuperarArchivo();
    }
}