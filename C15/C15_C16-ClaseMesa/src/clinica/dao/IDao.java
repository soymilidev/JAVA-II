package clinica.dao;

import java.util.List;

public interface IDao<T> {

    //alta = guardar
    T alta(T t);

    T buscar(Long id);

    //No devuelve nada
    void eliminar(Long id);

    //El T de modificar viene con Id, se busca actualizar todooo. Se guarda todooo.
    //T modificar(T t);
    void modificar(T t);

    //List<T> buscarTodo();
    List<T> listar();
}
