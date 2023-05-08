import com.company.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonaTest {

    @Test
    void testGetApellidoNombre() {
        // Arrange
        Persona persona = new Persona("Juan", "Perez", "juan.perez@example.com", 30);

        // Act
        String apellidoNombre = persona.getApellidoNombre();

        // Assert
        Assertions.assertEquals("Perez, Juan", apellidoNombre);
    }

    @Test
    void testEsMayorDe18() {
        // Arrange
        Persona personaMayor = new Persona("Juan", "Perez", "juan.perez@example.com", 30);
        Persona personaMenor = new Persona("Pedro", "Gomez", "pedro.gomez@example.com", 15);

        // Assert
        assertTrue(personaMayor.esMayorDe18());
        assertFalse(personaMenor.esMayorDe18());
    }
}