package com.company.services;

import com.company.dao.IDao;
import com.company.entities.Estudiante;

import java.util.List;

//Es un intermediario, le pasa la responsabilidad a estudianteDao
public class EstudianteService {
    private IDao<Estudiante> estudianteIDao;

    //getter y setter para modificar IDao<Estudiante> EstudianteIDao, setear la estrategia de persistencia
    public IDao<Estudiante> getEstudianteIDao() {
        return estudianteIDao;
    }

    public void setEstudianteIDao(IDao<Estudiante> estudianteIDao) {
        this.estudianteIDao = estudianteIDao;
    }

    //Creamos cada unos de los metodos
    public Estudiante guardarEstudiante(Estudiante e) {
        //Delega la responsabilidad de guardar al DAO
        return estudianteIDao.guardar(e);
    }

    public void eliminarEstudiante(Long id) {
        //Delega la responsabilidad de eliminar al DAO
        estudianteIDao.eliminar(id);
    }

    public Estudiante buscarEstudiante(Long id) {
        //Delega la responsabilidad de buscar al DAO
        return estudianteIDao.buscar(id);
    }

    public List<Estudiante> buscarTodos() {
        //Delega la responsabilidad de buscar a todos al DAO
        return estudianteIDao.buscarTodos();
    }
}
