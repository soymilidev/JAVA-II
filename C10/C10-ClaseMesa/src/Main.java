//Main = Cliente

import com.company.CalculadoraListaEnteros;

public class Main {
    public static void main(String[] args) {
        // Necesito crear la lista
        CalculadoraListaEnteros listado = new CalculadoraListaEnteros();
        //listado.agregarEnteros();
        for (int i = 0; i < 12; i++) {
            listado.agregarEntero(i);
        }
    }
}
