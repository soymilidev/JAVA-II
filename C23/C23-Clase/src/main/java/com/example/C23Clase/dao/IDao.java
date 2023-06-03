package com.example.C23Clase.dao;

import java.util.List;

public interface IDao<T> {
    T guardar(T t);

    List<T> listarTodos();

    T buscarXString(String valor);
}