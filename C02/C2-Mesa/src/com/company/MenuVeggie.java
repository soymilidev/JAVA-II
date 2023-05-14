package com.company;

public class MenuVeggie extends Menu{
    private int cantidadEspecias;
    private int cantidadSalsas;

    public MenuVeggie(Double precioBase, int cantidadEspecias, int cantidadSalsas) {
        super(precioBase);
        this.cantidadEspecias = cantidadEspecias;
        this.cantidadSalsas = cantidadSalsas;
    }

    public int getCantidadEspecias() {
        return cantidadEspecias;
    }

    public void setCantidadEspecias(int cantidadEspecias) {
        this.cantidadEspecias = cantidadEspecias;
    }

    public int getCantidadSalsas() {
        return cantidadSalsas;
    }

    public void setCantidadSalsas(int cantidadSalsas) {
        this.cantidadSalsas = cantidadSalsas;
    }
}
