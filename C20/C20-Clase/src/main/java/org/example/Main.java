package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Jorgito", "Pereyra", 12345, 100d));
        listaEmpleados.add(new Empleado("Claudio", "Nasser", 150, 200d));
        listaEmpleados.add(new Empleado("Ramon", "Ramirez", 456, 300d));
        listaEmpleados.add(new Empleado("Rodolfo", "Juarez", 351, 600d));
        //necesito guardarlos
        ManejadorDeEmpleados.guardarEmpleadosTxt(listaEmpleados);
    }
}