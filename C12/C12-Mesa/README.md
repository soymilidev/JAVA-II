# log4j & H2

## Enunciado

Debemos crear un statement para crear una tabla empleado con cinco columnas. La única columna obligatoria es la que
tiene el ID, que debe ser además PRIMARY KEY, las demás podés elegirlas.

- Debemos insertar tres filas con distintos datos, y una de ellas debe tener el ID repetido.
- Tenemos que verificar que nuestro log está mostrando este error —como los ID son primary keys, al intentar insertar el
  mismo id, nos va a dar un error, loguear el error—.
- Luego, hay que actualizar a uno de los empleados con un nuevo valor en alguna de las columnas y loguear con un objeto
  debug toda la información del empleado.
- Posteriormente, tenemos que eliminar un empleado según el ID y loguear como un objeto info toda la información del
  empleado eliminado.
- Por último, eliminamos otro empleado según otra columna —por ejemplo, email— y loguear como un objeto info toda la
  información del empleadoeliminado.

¡Éxitos!


