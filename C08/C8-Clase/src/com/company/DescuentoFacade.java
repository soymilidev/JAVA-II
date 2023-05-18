package com.company;

//Una fachada es una clase que proporciona una interfaz simple a un subsistema complejo que contiene muchas partes móviles.
//Es útil cuando hay que integrar la aplicación con una biblioteca con muchas funciones, de la cual sólo se precisan una pequeña parte.
//El patrón Facade proporciona acceso a una parte específica de la funcionalidad del subsistema.
//Sabe a dónde dirigir la petición del cliente y cómo operar todas las partes móviles.

public class DescuentoFacade{
    private ApiTarjeta apiTarjeta;
    private ApiProducto apiProducto;
    private ApiCantidad apiCantidad;

    public DescuentoFacade() {
        this.apiTarjeta = new ApiTarjeta();
        this.apiProducto = new ApiProducto();
        this.apiCantidad = new ApiCantidad();
    }

    public int calcularDescuento(Producto producto, Tarjeta tarjeta, int cantidad) {
        int descuentoTarjeta = apiTarjeta.descuento(tarjeta);
        int descuentoProducto = apiProducto.descuento(producto);
        int descuentoCantidad = apiCantidad.descuento(cantidad);

        return descuentoTarjeta + descuentoProducto + descuentoCantidad;

    }
}
