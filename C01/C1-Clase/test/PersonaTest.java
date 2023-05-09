import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {

    @Test
    public void testAgregarPersonasValidas() {
        //Dado
        Persona p1 = new Persona("Juan", 25);
        Persona p2 = new Persona("Pedro", 30);
        Persona p3 = new Persona("Ana", 20);
        Persona p4 = new Persona("Luz", 19);
        Persona p5 = new Persona("Julian", 35);

        Grupo grupo = new Grupo();

        //Cuando
        grupo.agregarPersona(p1);
        grupo.agregarPersona(p2);
        grupo.agregarPersona(p3);
        grupo.agregarPersona(p4);
        grupo.agregarPersona(p5);

        //Entonces
        System.out.println("Cantidad de personas:"+grupo.getCantidadPersonas());
        assertEquals(2, grupo.getCantidadPersonas());
    }

    @Test
    public void testAgregarPersonasValidasEdad() {
        Persona p1 = new Persona("Juan", 18);
        Persona p2 = new Persona("Pedro", 17);
        Persona p3 = new Persona("Ana", 22);
        Persona p4 = new Persona("Luz", 14);
        Persona p5 = new Persona("Julian", 32);

        Grupo grupo = new Grupo();

        grupo.agregarPersona(p1);
        grupo.agregarPersona(p2);
        grupo.agregarPersona(p3);
        grupo.agregarPersona(p4);
        grupo.agregarPersona(p5);

        assertEquals(1, grupo.getCantidadPersonas());
    }

    @Test
    public void testAgregarPersonasValidasNombre() {
        Persona p1 = new Persona("N1c0las", 25);
        Persona p2 = new Persona("Tomas", 30);
        Persona p3 = new Persona("3steban", 20);
        Persona p4 = new Persona("Carlos V", 19);
        Persona p5 = new Persona("Francisco II", 35);

        Grupo grupo = new Grupo();

        grupo.agregarPersona(p1);
        grupo.agregarPersona(p2);
        grupo.agregarPersona(p3);
        grupo.agregarPersona(p4);
        grupo.agregarPersona(p5);

        assertEquals(1, grupo.getCantidadPersonas());
    }
}