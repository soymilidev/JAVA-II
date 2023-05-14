import com.company.Menu;
import com.company.MenuClasico;
import com.company.MenuInfantil;
import com.company.MenuVeggie;
import service.Empleado;
import service.procesoClasico;
import service.procesoInfantil;
import service.procesoVeggie;

public class Main {
    public static void main(String[] args) {
        //Crear objetos, clases menu y empleado
        MenuClasico menuClasico = new MenuClasico(10.0);
        MenuInfantil menuInfantil = new MenuInfantil(10.0, 2);
        MenuVeggie menuVeggie = new MenuVeggie(10.0, 2, 3);

        Empleado empleadoClasico = new procesoClasico();
        Empleado empleadoInfantil = new procesoInfantil();
        Empleado empleadoVeggie = new procesoVeggie();

        //método preparar de cada objeto Empleado + objeto Menu correspondiente
        System.out.println("Menu clasico: " + empleadoClasico.preparar(menuClasico));
        System.out.println("Menu infantil: " + empleadoInfantil.preparar(menuInfantil));
        System.out.println("Menu veggie: " + empleadoVeggie.preparar(menuVeggie));
    }
}