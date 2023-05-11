package com.company;

public class EmpleadoContratado extends Empleado{
    private int cantidadHoras;
    private double valorHora;

    public EmpleadoContratado(String nombre, String apellido, String numeroDeCuenta, int cantidadDeHoras, double valorPorHora) {
        super(nombre, apellido, numeroDeCuenta);
        this.cantidadHoras = cantidadDeHoras;
        this.valorHora = valorPorHora;
    }

    public double getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}