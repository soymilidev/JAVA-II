
# Proyecto clínica odontológica

Seguimos mejorando el desarrollo existente de nuestro proyecto.
Para esta etapa, seguimos agregando excepciones para tratar los posibles errores de nuestra aplicación.

El chapter lead te pide:
- Crear una Excepción llamada BadRequestException.
- Lanzar esta excepción en el caso de que se intente registrar un turno, pero el paciente o el odontólogo no existan en la base de datos.
- Utilizar @ExceptionHandler para procesar la excepción desde el controller de turnos y retornar un ResponseEntity con el código de status 400 (BAD_REQUEST).

¡Éxitos!


