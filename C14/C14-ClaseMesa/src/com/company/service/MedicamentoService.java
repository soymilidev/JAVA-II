package com.company.service;

import com.company.dao.IDao;
import com.company.model.Medicamento;

//Esta clase tiene que vincularse con el DAO
//La clase es como un intermediario entre las personas que quieren guardar medicamentos
//y la persona que sabe cómo hacerlo (medicamentoiDao). Hace que el proceso de guardar medicamentos sea más fácil y organizado.
public class MedicamentoService {
    private IDao<Medicamento> medicamentoiDao;

    public MedicamentoService(IDao<Medicamento> medicamentoiDao) {

        this.medicamentoiDao = medicamentoiDao;
    }

    //Metodos que van a funcionar con el DAO
    public Medicamento guardarMedicamento(Medicamento medicamento) {
        //¿quien va a encargarse de guardar un medicamento? MedicamentoIDao tiene el metodo.
        return medicamentoiDao.guardar(medicamento);
    }

    public Medicamento buscarMedicamentoPorId(int id) {
        //¿quien va a encargarse de guardar un medicamento? MedicamentoIDao tiene el metodo.
        return medicamentoiDao.buscarPorId(id);
    }
}
