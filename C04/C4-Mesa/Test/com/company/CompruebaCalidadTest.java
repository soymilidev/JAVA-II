package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompruebaCalidadTest {
    @Test
    public void test_lote_invalido() {
        //Arrange
        Articulo articulo1 = new Articulo("Producto 1", 500, 1250, "sano");
        AnalistaDeCalidad analista = new AnalistaDeCalidad();
        //Act
        String resultado = analista.compruebaCalidad(articulo1);
        //Assert
        assertEquals("Rechazado - Lote.", resultado);
        System.out.println();
    }

    @Test
    public void test_peso_invalido() {
        Articulo articulo2 = new Articulo("Producto 2", 1500, 1400, "casi sano");
        AnalistaDeCalidad analista2 = new AnalistaDeCalidad();
        String resultado = analista2.compruebaCalidad(articulo2);
        assertEquals("Rechazado - Peso.", resultado);
        System.out.println();
    }

    @Test
    public void test_envase_invalido() {
        //Arrange
        Articulo articulo3 = new Articulo("Producto 3", 1800, 1250, "en mal estado");
        AnalistaDeCalidad analista3 = new AnalistaDeCalidad();
        //Act
        String resultado = analista3.compruebaCalidad(articulo3);
        //Assert
        assertEquals("Rechazado - Envase.", resultado);
        System.out.println();
    }

    @Test
    public void test_articulo_correcto() {
        //Arrange
        Articulo articulo4 = new Articulo("Producto 4", 1900, 1280, "sano");
        AnalistaDeCalidad analista4 = new AnalistaDeCalidad();
        //Act
        String resultado = analista4.compruebaCalidad(articulo4);
        //Assert
        assertEquals("El articulo fue ACEPTADO. Cumple con todos los requisitos de calidad.", resultado);
        System.out.println();
    }
}
