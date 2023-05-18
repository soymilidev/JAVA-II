package com.company;

//Una fachada es una clase que proporciona una interfaz simple a un subsistema complejo que contiene muchas partes móviles.
//Es útil cuando hay que integrar la aplicación con una biblioteca con muchas funciones, de la cual sólo se precisan una pequeña parte.
//El patrón Facade proporciona acceso a una parte específica de la funcionalidad del subsistema.
//Sabe a dónde dirigir la petición del cliente y cómo operar todas las partes móviles.

public class DescuentoFacade implements Descuento {

    @Override
    public int calcularDescuento(Tarjeta tarjeta, Producto producto, int cantidad) {
        int descuento = 0;
        // Aquí interactúan todas las API que deseo simplificar
        descuento = descuento + ApiTarjeta.descuento(tarjeta);
        descuento = descuento + ApiProducto.descuento(producto);
        descuento = descuento + ApiCantidad.descuento(cantidad);
        return descuento;
    }
}
