package com.company.dao;

import java.util.List;

//Pasamos por parametro el tipo = T = Estudiante
public interface IDao<T> {
    T guardar(T t);

    T eliminar(Long id);

    T buscar(Long id);

    List<T> buscarTodos();
}
