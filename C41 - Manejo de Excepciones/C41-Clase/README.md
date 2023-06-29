
# Proyecto clínica odontológica

Seguimos mejorando el desarrollo existente. Para esta etapa, vamos a agregar excepciones para tratar los posibles errores de nuestra aplicación.

El chapter lead pide:  
- Crear una Excepción llamada ResourceNotFoundException.  
- Lanzar esta excepción en el caso de que se intente eliminar un paciente, odontólogo o turno y no exista una entidad con el ID que llega.
- Utilizando @ControllerAdvice y @ExceptionHandler, procesar la excepción

ResourceNotFoundException de forma global y retornar un ResponseEntity con el código de status 404.

¡Manos a la obra!


