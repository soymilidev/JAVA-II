package service;

import com.company.Menu;
import com.company.MenuInfantil;

public class procesoInfantil extends Empleado {

    @Override
    protected String mensajePreparacion(Menu menu) {
        return "Agregar juguetes  | Total:$";
    }

    @Override
    protected Double calcularPrecio(Menu menu) {
        Double respuesta = menu.getPrecioBase();
        if(menu instanceof MenuInfantil){
            MenuInfantil menuInfantil = (MenuInfantil) menu;
            respuesta = respuesta + (3 * menuInfantil.getCantidadJuguetes());
        }
        return respuesta;
    }
}
