package com.company;

public class Circulo implements FiguraGeometrica {
    private double radio;
    public Circulo(double radio) {
        if (radio <= 0) {
            System.out.println("El valor del radio debe ser mayor que cero");
            return;
        }
        this.radio = radio;
    }

    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }

    public double calcularArea(){
        return Math.PI*(radio*radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}