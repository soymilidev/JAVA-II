package com.company.service;

import com.company.Empleado;
import com.company.EmpleadoContratado;
import com.company.EmpleadoEfectivo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LiquidadorDeSueldosTest {
    @Test
    void emite_documento_digital_para_empleado_efectivo() {
        //Arrange - Dado
        LiquidadorDeSueldos sujetoDePrueba = new LiquidadorDeSueldosEfectivo();
        Empleado empleado = new EmpleadoEfectivo("Martin", "Martin","Cuenta102022", 400, 40, 60);
        String restultadoEsperado = "La liquidación generada es un documento impreso. Saldo a liquidar: 420.0 Deposito en la cuenta Cuenta102022";

        //Act - Cuando
        String resultado = sujetoDePrueba.liquidarSueldo(empleado);

        //Assert - Entonces
        //Esperado-Obtenido
        assertEquals(restultadoEsperado, resultado);
    }

    @Test
    public void deberiaEmitirUnDocumentoImpresoParaUnEmpleadoContratado(){
        //DADO
        LiquidadorDeSueldos sujetoDePrueba = new LiquidadorDeSueldosContratado();
        Empleado empleado = new EmpleadoContratado("Pompilia", "Pompini","Cuenta112022", 120, 7.0);;
        String restultadoEsperado = "La liquidación generada es un documento digital. Saldo a liquidar: 840.0 Deposito en la cuenta Cuenta112022";

        //CUANDO
        String resultado = sujetoDePrueba.liquidarSueldo(empleado);

        //ENTONCES
        assertEquals(restultadoEsperado, resultado);
    }

    @Test
    void emite_mensaje_error_empleado_contratado_en_liquidador_efectivo() {
            //DADO
            LiquidadorDeSueldos sujetoDePrueba = new LiquidadorDeSueldosEfectivo();
            Empleado empleado = new EmpleadoContratado("Pompilia", "Pompini","Cuenta112022", 120, 7.0);;
            String restultadoEsperado = "La liquidación no pudo ser calculada";

            //CUANDO
            String resultado = sujetoDePrueba.liquidarSueldo(empleado);

            //ENTONCES
            assertEquals(restultadoEsperado, resultado);
        }
    }