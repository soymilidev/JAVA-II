package com.company;

public class AnalistaDeCalidad {
    private CompruebaCalidad primerControl;

    public AnalistaDeCalidad() {
        primerControl = new ControlLote();
        CompruebaCalidad lotePeso = new ControlPeso();
        CompruebaCalidad loteEnvasado = new ControlEnvase();

        primerControl.setSiguienteControl(lotePeso);
        lotePeso.setSiguienteControl(loteEnvasado);
    }

    public CompruebaCalidad getPrimerControl() {
        return primerControl;
    }

    public void setPrimerControl(CompruebaCalidad primerControl) {
        this.primerControl = primerControl;
    }

    public String compruebaCalidad(Articulo articulo){
        return primerControl.comprobar(articulo);
    }
}
