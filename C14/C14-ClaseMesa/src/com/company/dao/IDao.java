package com.company.dao;

//parametrizado ---> T, como un comodin
//<T>=Tipo=Medicamento
public interface IDao<T> {
    // No es necesario especificar public en los métodos de la interfaz,
    // todos los métodos de una interfaz son públicos por defecto.
    // guardar, eliminar, actualizar
    T guardar(T t);
    //T buscarPorId(T t);
    T buscarPorId(int id);
}
