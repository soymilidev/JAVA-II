package service;

import com.company.Menu;
import com.company.MenuVeggie;

public class procesoVeggie extends Empleado {
    protected String mensajePreparacion(Menu menu) {
        return "Agregar vegetales | Total:$";
    }

    @Override
    protected Double calcularPrecio(Menu menu) {
        Double respuesta = menu.getPrecioBase();
        Double recargo = 0.01;
        if (menu instanceof MenuVeggie) {
            MenuVeggie vegetariano = (MenuVeggie) menu;
            if (vegetariano.getCantidadEspecias() > 1) {
                respuesta += respuesta * recargo;
            }
            if (vegetariano.getCantidadSalsas() > 0) {
                respuesta += 2 * vegetariano.getCantidadSalsas();
            }
            if (vegetariano.getCantidadEspecias() > 1 && vegetariano.getCantidadSalsas() > 0) {
                respuesta += respuesta * recargo;
            }
        }
        return respuesta;
    }
}