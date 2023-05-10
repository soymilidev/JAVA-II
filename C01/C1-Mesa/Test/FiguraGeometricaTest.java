import com.company.Circulo;
import com.company.Cuadrado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiguraGeometricaTest {

    @Test
    public void testCalcularPerimetroCirculo() {
        Circulo circulo = new Circulo(2);
        double resultado = circulo.calcularPerimetro();
        assertEquals(12.566370614359172, resultado);
    }

    @Test
    public void testCalcularAreaCirculo() {
        Circulo circulo = new Circulo(2);
        assertEquals(12.566370614359172, circulo.calcularArea());
    }

    @Test
    public void testCalcularPerimetroCuadrado() {
        Cuadrado cuadrado = new Cuadrado(2);
        assertEquals(8.0, cuadrado.calcularPerimetro());
    }

    @Test
    public void testCalcularAreaCuadrado() {
        Cuadrado cuadrado = new Cuadrado(2);
        assertEquals(4.0, cuadrado.calcularArea());
    }
}