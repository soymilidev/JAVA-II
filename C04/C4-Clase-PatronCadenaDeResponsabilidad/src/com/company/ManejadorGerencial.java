package com.company;

public class ManejadorGerencial extends Manejador{
    @Override
    public String comprobar(Mail mail) {
        if (mail.getDestino().equals("gerencial@comercial.com") || mail.getTema().equals("Gerencial")) {
            System.out.println("Lo atenderá en minutos el sector Gerencial");
            return "Usted está siendo atendido por el sector: ";
        }
        else{
            System.out.println("Mail paso por el sector Gerencial");
            /*pasamos al sigiuiente manejador
             * que lo conozco gracias al atributo siguiente, aca aparacec algo asi como veian en stat*/
            return getSiguienteManejador().comprobar(mail);
        }
    }
}
