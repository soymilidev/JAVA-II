package com.company.service;

import com.company.Empleado;
import com.company.EmpleadoContratado;
public class LiquidadorDeSueldosContratado extends LiquidadorDeSueldos {
    @Override
    protected double calcularSueldo(Empleado empleado) {
        //String mensajeDeRespuesta = "No pude procesar";
        double respuesta = 0;
        //Es una CLASE POLIMORFICA
        //CASTEO: empleado convertite en empleadoContratado
        //Si el empleado es efectivo entonces...
        if (empleado instanceof EmpleadoContratado){
            EmpleadoContratado empleadoContratado = (EmpleadoContratado) empleado;
            respuesta = empleadoContratado.getCantidadHoras() * empleadoContratado.getValorHora();
        }
        return respuesta;
    }

    @Override
    protected String generarRecibo(Empleado empleado) {
        return "La liquidación generada es un documento digital.";
    }
}