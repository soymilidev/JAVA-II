package clinica.service;

import clinica.bd.Bd;
import clinica.bd.DomicilioDaoH2;
import clinica.bd.PacienteDaoH2;
import clinica.model.Domicilio;
import clinica.model.Paciente;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PacienteServiceTest {
    private PacienteDaoH2 pacienteDao;
    private DomicilioDaoH2 domicilioDao;

    // Crear un domicilio
    Domicilio domicilio1 = new Domicilio(123456L, "Avenida Libertador", "1234", "San Isidro", "Buenos Aires");
    Domicilio domicilio2 = new Domicilio(123457L, "Calle San Martin", "742", "Bella Vista", "Buenos Aires");

    // Crear un paciente con el domicilio creado
    Paciente paciente1 = new Paciente(12345680L, "Luis", "Garcia", "12345678", LocalDate.of(2023, 05, 01), domicilio1);
    Paciente paciente2 = new Paciente(12345781L, "Maria", "Lopez", "87654321", LocalDate.now(), domicilio2);

    @BeforeAll
    public static void setup() {
        Bd.crearTablas();
    }

    @BeforeEach
    public void beforeEach() {
        pacienteDao = new PacienteDaoH2();
        domicilioDao = new DomicilioDaoH2();
        domicilioDao.alta(domicilio1);
        domicilioDao.alta(domicilio2);
        pacienteDao.alta(paciente1);
        pacienteDao.alta(paciente2);
    }

    @AfterEach
    public void afterEach() {
        pacienteDao.eliminar(paciente1.getId());
        pacienteDao.eliminar(paciente2.getId());
        domicilioDao.eliminar(domicilio1.getId());
        domicilioDao.eliminar(domicilio2.getId());
        //domicilioDao.eliminarTodos();
    }

    @Test
    public void agregarPacienteYBuscarPorId() {
        //Crear un domicilio
        //Alta domicilio

        //Crear un paciente con el domicilio creado
        //Alta paciente
        pacienteDao.alta(paciente1);

        // Buscar al paciente por ID
        Paciente pacienteEncontrado = pacienteDao.buscar(paciente1.getId());

        // Verificar que el paciente encontrado sea el mismo
        assertNotNull(pacienteEncontrado);
        assertEquals(paciente1.getId(), pacienteEncontrado.getId());
    }

    @Test
    public void eliminarPacienteYBuscarPorId() {
        //Crear un domicilio
        //Alta domicilio

        //Crear un paciente con el domicilio creado
        //Alta paciente

        // Eliminar al paciente
        pacienteDao.eliminar(paciente1.getId());

        // Buscar al paciente por ID después de eliminarlo
        Paciente pacienteEncontrado = pacienteDao.buscar(paciente1.getId());

        // Verificar que el paciente no haya sido encontrado
        assertNull(pacienteEncontrado);
    }

    @Test
    public void listarPacientesConDomicilios() {
        //Alta domicilios
        //Alta pacientes con los domicilios

        //Listar pacientes
        List<Paciente> pacientes = pacienteDao.listar();

        //Verificar la cantidad de pacientes
        //Van a ser 4, hay 2 creados en la bd
        assertEquals(4, pacientes.size());
    }

    @Test
    public void TestBuscarTodos() {
        //DADO
        PacienteService pacienteService = new PacienteService(new PacienteDaoH2());
        //CUANDO
        List<Paciente> pacientes = pacienteService.listarPacientes();
        //ENTONCES
        assertEquals(4, pacientes.size());
    }

    @Test
    public void testBuscar() {
        PacienteService pacienteService = new PacienteService(new PacienteDaoH2());
        long idABuscar = 1;
        Paciente paciente = pacienteService.buscarPaciente(idABuscar);
        assertNotNull(paciente);
    }
}
