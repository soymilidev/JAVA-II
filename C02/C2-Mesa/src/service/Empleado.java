package service;

import com.company.Menu;

public abstract class Empleado {
    public String preparar(Menu menu){
        String respuesta = mensajePreparacion(menu);
        respuesta = respuesta + calcularPrecio(menu);
        return respuesta;
    }
    protected abstract String mensajePreparacion(Menu menu);
    protected  abstract Double calcularPrecio(Menu menu);
}
