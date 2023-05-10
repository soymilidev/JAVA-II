package com.company;
public class Cuadrado implements FiguraGeometrica {
    private double lado;
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado <= 0) {
            System.out.println("El valor del lado debe ser mayor que cero");
            return;
        }
        this.lado=lado;
    }

    public Cuadrado(double lado) {
        this.lado=lado;
    }

    public double calcularPerimetro(){
        return (lado*4);
    }

    public double calcularArea(){
        return (lado * lado);
    }
}