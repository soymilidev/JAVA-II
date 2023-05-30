package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ManejoDeArchivos {
    public static void main(String[] args) {
        // Listado de contactos en el main
    }

    //Guardamos la colección de contactos en el archivo "contactos.txt" utilizando la serialización de objetos
    public static void guardarArchivo(List<Contacto> contactos) {
        // Enviar-Guardar una colección en un archivo con extensión .txt
        FileOutputStream fos;
        try {
            // Salida
            fos = new FileOutputStream("contactos.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(contactos);
            oos.close();
            System.out.println("Lista OK.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // Recuperar los objetos del archivo
    public static void recuperarArchivo() {
        List<Contacto> contactosRecuperados = null;
        FileInputStream fis;
        try {
            // Entrada
            fis = new FileInputStream("contactos.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            contactosRecuperados = (List<Contacto>) ois.readObject();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (contactosRecuperados != null) {
            for (Contacto persona : contactosRecuperados) {
                System.out.println(persona.toString());
            }
        }
    }
}