import clinica.bd.Bd;
import clinica.bd.DomicilioDaoH2;
import clinica.bd.PacienteDaoH2;
import clinica.model.Domicilio;
import clinica.model.Paciente;
import clinica.service.PacienteService;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Crear la tabla
        Bd.crearTablas();

        // Crear objetos DAO
        DomicilioDaoH2 domicilioDAO = new DomicilioDaoH2();
        PacienteDaoH2 pacienteDAO = new PacienteDaoH2();

        // Crear objetos de prueba
        Domicilio domicilio = new Domicilio("Arenales", "123", "Bella Vista", "Buenos Aires");
        domicilioDAO.alta(domicilio);

        Paciente paciente1 = new Paciente("Juan", "Perez", "12345678", LocalDate.now(), domicilio);
        Paciente paciente2 = new Paciente("Maria", "Gomez", "98765432", LocalDate.now(), domicilio);
        pacienteDAO.alta(paciente1);
        pacienteDAO.alta(paciente2);


        // Crear objeto de servicio
        PacienteService pacienteService = new PacienteService(pacienteDAO);

        // Ejecutar operaciones
        Paciente pacienteEncontrado = pacienteService.buscarPaciente(1L);
        //System.out.println("Paciente encontrado: " + '\n' + pacienteEncontrado);


        List<Paciente> listaPacientes = pacienteService.listarPacientes();
        System.out.println("Lista de pacientes: " + '\n' );
        for (Paciente paciente : listaPacientes) {
            System.out.println(paciente);
        }

        // Actualizar un paciente
        pacienteEncontrado.setNombre("Juan Carlos");
        pacienteService.modificarPaciente(pacienteEncontrado);

        // Eliminar un paciente
        pacienteService.eliminarPaciente(2L);
    }
}
