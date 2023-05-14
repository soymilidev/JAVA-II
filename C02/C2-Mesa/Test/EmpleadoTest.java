import com.company.MenuInfantil;
import com.company.MenuVeggie;
import com.company.MenuClasico;
import service.ProcesoInfantil;
import service.ProcesoVeggie;
import service.ProcesoClasico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    @Test
    void test_menu_infantil() {
        MenuInfantil menuInfantil = new MenuInfantil(100.0, 2);
        assertEquals(100.0, menuInfantil.getPrecioBase());
        assertEquals(2, menuInfantil.getCantidadJuguetes());
    }

    @Test
    void test_menu_veggie() {
        MenuVeggie menuVeggie = new MenuVeggie(100.0, 3, 1);
        assertEquals(100.0, menuVeggie.getPrecioBase());
        assertEquals(3, menuVeggie.getCantidadEspecias());
        assertEquals(1, menuVeggie.getCantidadSalsas());
    }

    @Test
    void test_menu_clasico() {
        MenuClasico menuClasico = new MenuClasico(100.0);
        assertEquals(100.0, menuClasico.getPrecioBase());
    }
}
