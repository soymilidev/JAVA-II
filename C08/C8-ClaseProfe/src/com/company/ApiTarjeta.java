package com.company;

public class ApiTarjeta {
    public static int descuento(Tarjeta tarjeta) {
        // Si paga con Star Bank, se aplica un 20% de descuento
        if (tarjeta.getBanco().equals("star bank")) {
            return 20;
        } else {
            return 0;
        }
    }
}
