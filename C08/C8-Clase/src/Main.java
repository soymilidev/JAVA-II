import com.company.DescuentoFacade;
import com.company.Producto;
import com.company.Tarjeta;

public class Main {
    public static void main(String[] args) {
        // Crear producto, tarjeta y descuento
        Producto producto = new Producto("Producto1", "Lata" );
        Tarjeta tarjeta = new Tarjeta("123", "Star Bank");
        DescuentoFacade descuento = new DescuentoFacade();

        // Calcular descuento
        int descuentoTotal = descuento.calcularDescuento(producto, tarjeta, 15);

        // Imprimir resultado
        System.out.println("Descuento total: " + descuentoTotal + "%");
    }
}