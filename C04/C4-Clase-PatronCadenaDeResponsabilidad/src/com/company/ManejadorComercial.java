package com.company;

public class ManejadorComercial extends Manejador{
    @Override
    public String comprobar(Mail mail) {
        if(mail.getDestino().equals("comercial@colmena.com") || mail.getTema().equals("Comercial")){
            System.out.println("Lo atenderá en minutos el sector Comercial");
            return "Usted está siendo atendido por el sector Comercial";
        }
        else {
            System.out.println("Mail paso por el sector Comercial");
            //trae el siguiente manejador.
            return getSiguienteManejador().comprobar(mail);
        }
    }
}
