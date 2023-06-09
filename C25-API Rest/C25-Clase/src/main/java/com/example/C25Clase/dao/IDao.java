package com.example.C25Clase.dao;

import java.util.List;

public interface IDao<T> {
    T guardar(T t);

    T buscar(int id);

    List<T> listarTodos();

    T buscarXString(String valor);
}
