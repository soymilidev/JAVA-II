package clinica.service;

import clinica.dao.IDao;
import clinica.model.Paciente;

import java.util.List;

// Clase intermediaria
public class PacienteService {
    //IDao<Paciente> = Tipo
    //El tipo IDao<Paciente> indica que la variable pacienteIDao debe ser de un tipo que implemente
    //la interfaz IDao con el argumento de tipo Paciente.
    //pacienteIDao puede referirse a cualquier objeto de una clase que implemente la interfaz IDao con el tipo Paciente.
    private IDao<Paciente> pacienteIDao;

    //Constructor
    public PacienteService(IDao<Paciente> pacienteIDao) {

        this.pacienteIDao = pacienteIDao;
    }

    // Métodos
    public Paciente altaPaciente(Paciente paciente) {

        return pacienteIDao.alta(paciente);
    }

    public Paciente buscarPaciente(Long id) {

        return pacienteIDao.buscar(id);
    }

    public void modificarPaciente(Paciente paciente) {
        pacienteIDao.modificar(paciente);
    }

    public void eliminarPaciente(Long id) {

        pacienteIDao.eliminar(id);
    }

    public List<Paciente> listarPacientes() {
        return
                pacienteIDao.listar();
    }
}
