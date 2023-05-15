package com.company;

public abstract class CompruebaCalidad {
    private CompruebaCalidad siguienteControl;

    public CompruebaCalidad getSiguienteControl() {
        return siguienteControl;
    }

    public void setSiguienteControl(CompruebaCalidad siguienteControl) {
        this.siguienteControl = siguienteControl;
    }

    public abstract String comprobar(Articulo articulo);
}
