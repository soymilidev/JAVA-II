package com.company;

public class Arbol {
    private int alto;
    private int horizontal;
    private String color;
    private String tipo;

    public Arbol(int alto, int horizontal, String color, String tipo) {
        this.alto = alto;
        this.horizontal = horizontal;
        this.color = color;
        this.tipo = tipo;
    }

    public void mostrar() {
        System.out.println("Tipo: " + tipo + ", Alto: " + alto + ", Horizontal: " + horizontal + ", Color: " + color);
    }
}
