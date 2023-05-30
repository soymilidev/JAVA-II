package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear la lista de empleados
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Jorgito", "Pereyra", 12345, 100d));
        listaEmpleados.add(new Empleado("Claudio", "Nasser", 150, 200d));
        listaEmpleados.add(new Empleado("Ramon", "Ramirez", 456, 300d));
        listaEmpleados.add(new Empleado("Rodolfo", "Juarez", 351, 600d));

        // Crear la empresa con la lista de empleados
        Empresa empresa = new Empresa("12345", "Grupo DH", listaEmpleados);

        // Guardar la empresa en un archivo
        ManejadorDeEmpleados.guardarEmpresa(empresa);

        // Recuperar la empresa del archivo
        Empresa empresaRecuperada = ManejadorDeEmpleados.recuperarEmpresa();

        // Imprimir los datos de la empresa recuperada
        if (empresaRecuperada != null) {
            System.out.println(empresa.toString());

            for (Empleado empleado : empresaRecuperada.getEmpleados()) {
                System.out.println(empleado.toString());
                System.out.println();
            }
        }
    }
}