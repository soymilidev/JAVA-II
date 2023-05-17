import com.company.ArbolFactory;
import com.company.Bosque;

public class Main {
    public static void main(String[] args) {
Bosque bosque = new Bosque();
        bosque.plantarArboles();

        System.out.println();
        //Usando esta sentencia se podrá ver la memoria usada:
        Runtime runtime = Runtime.getRuntime();
        System.out.println(
                "Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024)
        );
    }
}
