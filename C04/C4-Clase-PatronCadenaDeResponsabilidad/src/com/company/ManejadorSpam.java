package com.company;

public class ManejadorSpam extends Manejador {
    @Override
    public String comprobar(Mail mail) {
        System.out.println("Mail derivado a SPAM");
        return "Mail enviado a SPAM";
    }
}
