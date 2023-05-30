package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Empresa implements Serializable {
    private String cuit;
    private String razonSocial;
    private List<Empleado> empleados;

    public Empresa(String cuit, String razonSocial, List<Empleado> empleados) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.empleados = empleados;
    }

    // Getters y setters
    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cuit='" + cuit + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}