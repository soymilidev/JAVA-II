import com.company.dao.Bd;
import com.company.dao.EstudianteDAOH2;
import com.company.entities.Estudiante;
import com.company.services.EstudianteService;

public class Main {
    public static void main(String[] args) {
        // Crear la tabla
        Bd.crearTabla();
        Estudiante estudiante = new Estudiante();

        //L porque es un Long
        estudiante.setId(1L);
        estudiante.setNombre("Maria");
        estudiante.setApellido("Nieves");

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setId(2L);
        estudiante2.setNombre("Pablo");
        estudiante2.setApellido("Picapiedras");

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setId(3L);
        estudiante3.setNombre("Blanca");
        estudiante3.setApellido("Nieves");

        EstudianteService estudianteService = new EstudianteService();
        // Seteamos una estrategia de persistencia, es decir un DAO
        estudianteService.setEstudianteIDao(new EstudianteDAOH2());

        estudianteService.guardarEstudiante(estudiante);
        estudianteService.guardarEstudiante(estudiante2);
        estudianteService.guardarEstudiante(estudiante3);

        //buscarEstudiante(922337203685477581L);
        estudianteService.buscarEstudiante(2L);
        estudianteService.buscarEstudiante(3L);

        estudianteService.buscarTodos();

        estudianteService.eliminarEstudiante(3L);
    }
}