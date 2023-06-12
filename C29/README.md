
# Proyecto clínica odontológica

## Enunciado C29

### Objetivo
Teniendo en cuenta lo que venís trabajando sobre el proyecto de la clínica odontológica, ahora vas a probar la API de turnos con Postman.

### Desafío
Anteriormente desarrollaste la API de turnos para la clínica odontológica siguiendo las siguientes condiciones:  
● Dar de alta nuevos turnos, previamente validar que el paciente y el odontólogo existen en el sistema.  
○ Para este punto retorna un código de status 400(BAD REQUEST) en caso de que no existan el paciente o el odontólogo. En caso de registrar correctamente el turno, retornar 200.  
○ PATH: /turnos METODO: POST  
● Listar todos los turnos.  
○ PATH:/turnos METODO : GET  
● Eliminar turnos.  
○ PATH :/turnos/{id} METODO: DELETE  
● Actualizar turnos.  
○ PATH: /turnos METODO: PUT  

Para esta etapa final, te solicitan probar estos cuatro endpoints utilizando postman.