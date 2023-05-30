package org.example;

import java.io.*;
import java.util.List;

class ManejadorDeEmpleados {
    public static void guardarEmpresa(Empresa empresa) {
        try {
            FileOutputStream fos = new FileOutputStream("empresa.txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(empresa);
            out.close();
            fos.close();
            System.out.println("Empresa guardada en el archivo empresa.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Empresa recuperarEmpresa() {
        try {
            FileInputStream fileIn = new FileInputStream("empresa.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Empresa empresa = (Empresa) in.readObject();
            in.close();
            fileIn.close();
            return empresa;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}