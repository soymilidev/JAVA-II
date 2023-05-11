package com.company.service;

import com.company.Empleado;
import com.company.EmpleadoEfectivo;

public class LiquidadorDeSueldosEfectivo extends LiquidadorDeSueldos {
    @Override
    protected double calcularSueldo(Empleado empleado) {
        //String mensajeDeRespuesta = "La liquidación no pudo ser calculada";
        double mensajeDeRespuesta = 0;
        //Es una CLASE POLIMORFICA
        //CASTEO: empleado convertite en empleadoEfectivo
        //Si el empleado es efectivo entonces...
        if(empleado instanceof EmpleadoEfectivo){
            EmpleadoEfectivo empleadoEfectivo = (EmpleadoEfectivo) empleado;
            double sueldoFinal = empleadoEfectivo.getSueldoBasico() + empleadoEfectivo.getPremios() - empleadoEfectivo.getDescuentos();
            mensajeDeRespuesta = sueldoFinal;
        }
        return mensajeDeRespuesta;
    }

    @Override
    protected String generarRecibo(Empleado empleado) {
        return "La liquidación generada es un documento impreso.";
    }
}