package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {

        //1 - ESCRITURA DE LA LISTA - GUARDAR
        //listado de perros
        List<Perro> canes = new ArrayList<>();
        canes.add(new Perro(9, "Sasha"));
        canes.add(new Perro(10, "Coco"));
        canes.add(new Perro(10, "Ulises"));
        canes.add(new Perro(6, "Duquesa"));
        canes.add(new Perro(15, "Mochi"));
        canes.add(new Perro(11, "Lula"));
        canes.add(new Perro(10, "Galo"));
        //enviar la lista a un archivo para despues recuperarlo
        //geralmente aquello que trabaja con un recurso externo genera excepcion (puede que no haya acceso, este caido)
        FileOutputStream fos;
        try {
            fos = new FileOutputStream("lista.txt");
            //como vamos a guardar objetos, usamos una clase de ayuda
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(canes);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //2 - RECUPERACION DE LA LISTA
        //recuperamos la lista desde el archivo
        List<Perro> canesRecuperados = null;
        FileInputStream fis;
        try {
            //flujo de entrada
            fis = new FileInputStream("lista.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //CASTEO ---> (ArrayList) ois.readObject();
            //para convertir el objeto leído en un ArrayList de Perro y se asigna a la variable canesRecuperados.
            canesRecuperados = (ArrayList) ois.readObject();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        for (Perro can : canesRecuperados) {
            System.out.println(can);
        }
    }
}