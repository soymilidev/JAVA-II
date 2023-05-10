import com.dh.pizzeria.Cocinero;
import com.dh.pizzeria.CocineroNoVeggie;
import com.dh.pizzeria.CocineroVeggie;

public class Main {
    public static void main(String[] args) {
        Cocinero cocineroVeggie = new CocineroVeggie();
        Cocinero cocineroNoVeggie = new CocineroNoVeggie();

        cocineroVeggie.hacerPizza();
        cocineroNoVeggie.hacerPizza();
    }
}