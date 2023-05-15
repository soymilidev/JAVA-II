package com.company;

public class CompruebaMail {
    //Tambien se puede llamar cadena en vez de inicial
    private Manejador inicial;

    public CompruebaMail() {
        //inicializamos la cadena en Gerencial
        //Crear instancias
        inicial = new ManejadorGerencial();
        Manejador tecnico = new ManejadorTecnico();
        Manejador comercial = new ManejadorComercial();
        Manejador spam = new ManejadorSpam();

        inicial.setSiguienteManejador(tecnico);
        tecnico.setSiguienteManejador(comercial);
        comercial.setSiguienteManejador(spam);
    }

    //En lo anterior generamos los eslabones
    //
    public String compruebaMail(Mail mail){

        return inicial.comprobar(mail);
    }

    public Manejador getInicial() {

        return inicial;
    }

    public void setInicial(Manejador inicial) {

        this.inicial = inicial;
    }
}
