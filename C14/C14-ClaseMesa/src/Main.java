import com.company.dao.BaseDeDatos;
import com.company.dao.MedicamentoDaoH2;
import com.company.model.Medicamento;
import com.company.service.MedicamentoService;

public class Main {
    public static void main(String[] args) {
        // Crear la tabla
        BaseDeDatos.crearTabla();

        // Preparar el medicamento y se lo doy al service (siguiente comentario) y el service lo entrega a DaoH2
        Medicamento medicamento = new Medicamento(1, 12345, "Ibuprofeno", "Bayer", 10, 500.0);
        Medicamento medicamento2 = new Medicamento(2, 12346, "Bayaspirina", "Bayer", 30, 700.0);
        Medicamento medicamento3 = new Medicamento(3, 12347, "Aspirineta", "Bayer", 28, 235.0);

        // Instanciar el servicio y guardar el medicamento
        // ¿Quien interviene para guardarlo?
        MedicamentoService medicamentoService = new MedicamentoService(new MedicamentoDaoH2());

        // Guardar
        medicamentoService.guardarMedicamento(medicamento);
        medicamentoService.guardarMedicamento(medicamento2);
        medicamentoService.guardarMedicamento(medicamento3);

        // Buscar
        Medicamento medicamentoEncontrado = medicamentoService.buscarMedicamentoPorId(2);
        // Imprimir sus detalles
        System.out.println(medicamentoEncontrado);
    }
}
