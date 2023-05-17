import com.company.Computadora;
import com.company.ComputadoraFactory;

public class Main {
    public static void main(String[] args) {
        ComputadoraFactory computadoraFactory = new ComputadoraFactory();

        // Obtener una computadora de tipo Windows
        Computadora windows1 = computadoraFactory.getComputer("Windows");
        Computadora windows2 = computadoraFactory.getComputer("Windows");

        // Obtener una computadora de tipo Mac
        Computadora mac1 = computadoraFactory.getComputer("Mac");

        // Imprimir las especificaciones de las computadoras
        System.out.println("Especificaciones de la computadora Windows 1:");
        System.out.println("RAM: " + windows1.getRam());
        System.out.println("Disco Duro: " + windows1.getDiscoDuro());
        System.out.println("ID: " + windows1.getId());
        System.out.println();

        System.out.println("Especificaciones de la computadora Windows 2:");
        System.out.println("RAM: " + windows2.getRam());
        System.out.println("Disco Duro: " + windows2.getDiscoDuro());
        System.out.println("ID: " + windows2.getId());
        System.out.println();

        System.out.println("Especificaciones de la computadora Mac 1:");
        System.out.println("RAM: " + mac1.getRam());
        System.out.println("Disco Duro: " + mac1.getDiscoDuro());
        System.out.println("ID: " + mac1.getId());
        System.out.println();

        // Imprimir el número total de computadoras creadas
        System.out.println("Número total de computadoras creadas: " + computadoraFactory.getTotalComputadoras());
    }
}
