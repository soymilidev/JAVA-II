import com.company.Descuento;
import com.company.DescuentoFacade;
import com.company.Producto;
import com.company.Tarjeta;

public class Main {
    public static void main(String[] args) {
        // Definir la fachada
        DescuentoFacade fachada = new DescuentoFacade();

        // Datos iniciales
        Producto producto = new Producto("Arvejas", "latas");
        Tarjeta tarjeta = new Tarjeta("123456", "star bank");

        System.out.println("Descuentos acumulados: " + fachada.calcularDescuento(tarjeta, producto, 15) + "%");

        System.out.println();
    }
}