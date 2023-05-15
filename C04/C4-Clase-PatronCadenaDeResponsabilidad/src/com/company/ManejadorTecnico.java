package com.company;

public class ManejadorTecnico extends Manejador{
    @Override
    public String comprobar(Mail mail) {
        if(mail.getDestino().equals("tecnico@colmena.com")||mail.getTema().equals("tecnico")){
            System.out.println("Lo atenderá en minutos el sector Tecnico");
            return "Usted está siendo atendido por el sector Tecnico";
        }
        else{
            System.out.println("Mail paso por el sector Tecnico");
            return getSiguienteManejador().comprobar(mail);
        }
    }
}
