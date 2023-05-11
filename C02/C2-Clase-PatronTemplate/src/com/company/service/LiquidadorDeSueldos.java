package com.company.service;

import com.company.Empleado;

public abstract class LiquidadorDeSueldos {
    public String liquidarSueldo(Empleado empleado){
        String respuesta = "La liquidación no pudo ser calculada";
        //operaciones
        double sueldo=calcularSueldo(empleado);
        if (sueldo>0){
            String recibo = generarRecibo(empleado);
            String deposito = depositarSueldo(empleado);
            respuesta = recibo + " Saldo a liquidar: " + sueldo + deposito;
        }
        return respuesta;
    }
    protected abstract double calcularSueldo(Empleado empleado);
    protected abstract String generarRecibo(Empleado empleado);
    private String depositarSueldo(Empleado empleado){

        return " Deposito en la cuenta " + empleado.getNumeroDeCuenta();
    }
}