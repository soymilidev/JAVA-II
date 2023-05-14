package service;

import com.company.Menu;

public class procesoClasico extends Empleado {
    @Override
    protected String mensajePreparacion(Menu menu) {
        return "Agregar indicaciones | Total:$";
    }

    @Override
    protected Double calcularPrecio(Menu menu) {
        return menu.getPrecioBase();
    }
}
