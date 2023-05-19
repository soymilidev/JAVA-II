package service;

import java.util.Date;

//La interfaz determinará las reglas del Facade

public interface IBusquedaFacade {
    void busqueda(String origen, String destino, Date fechaSalida, Date fechaRegreso);
}
