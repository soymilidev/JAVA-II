package com.company;

public class Cuenta {
    private int id;
    private int numCuenta;
    private String nombre;
    private double saldo;

    //Cuando tengo que RECUPERAR los datos de la base trabajo con este constructor:
    public Cuenta(int id, int numeroCuenta, String nombre, double saldo) {
        this.id = id;
        this.numCuenta = numeroCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    //Puedo tener los datos pero no el id (trabajo con el objeto). El id lo genera/CARGA la base:
    public Cuenta(int numeroCuenta, String nombre, double saldo) {
        this.numCuenta = numeroCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }
}
