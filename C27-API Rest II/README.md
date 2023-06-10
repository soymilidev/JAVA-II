
# Proyecto clínica odontológica

## Enunciado C27-Clase
Además de gestionar los pacientes y odontólogos, ahora desde la clínica nos piden que **los pacientes puedan sacar turno para ser atendidos por los odontólogos**. Luego del relevamiento, sabemos que un turno estará compuesto por:  
● Id.  
● Paciente.  
● Odontólogo.  
● Fecha y hora.  

Nuestro chapter lead para esta etapa nos pide crear la capa de persistencia, de servicio, y crear la capa de controller para gestionar los turnos desde una API REST.

El sistema deberá permitirnos:  
● Dar de alta nuevos turnos, previamente validar que el paciente y el odontólogo existen en el sistema.    
○ Para este punto, retorna un código de estado 400 (BAD REQUEST) en caso de que no existan el paciente o el odontólogo. En caso de registrar correctamente el turno, retornar 200.  
○ PATH: /turnos MÉTODO: POST  

● Listar todos los turnos.  
○ PATH: /turnos MÉTODO: GET

👉 En la capa de persistencia, no utilizar una base de datos ya que desde el área de arquitectura aún están evaluando la mejor opción para el caso de los turnos. Por el momento, utilizar listas para realizar las operaciones.

¡Éxitos!


## Enunciado C27-Mesa
Ahora, el chapter lead para esta etapa te pide terminar la capa de persistencia y la capa de controller para gestionar los turnos desde una API rest.

Al sistema deberemos añadirle:  
● Eliminar turnos.  
○ PATH :/turnos/{id} METODO: DELETE  
● Actualizar turnos.  
○ PATH: /turnos METODO: PUT  
● buscar un turno  
○ PATH: /turnos/{id} METODO: GET  

👉 En la capa de persistencia, no utilizar una base de datos ya que desde el área de arquitectura aún están evaluando la mejor opción para el caso de los turnos. Por el momento, utilizar listas para realizar las operaciones.  
👉 Agregar este desarrollo al proyecto en el que ya venís trabajando.  
👉Para todas las respuestas de la API se debe utilizar la clase ResponseEntity.

💣💥 ¡Bonus track! 💣💥  
Si terminaste el desarrollo anterior y aún tenés tiempo, te proponemos una pequeñarefactorización:  
Hasta el momento, al paquete de persistencia lo llamábamos DAO haciendo referencia al patrón Data Access Object. Ahora que usamos spring boot es más conveniente llamarlo Repository ya que este es el nombre de las interfaces que utiliza el módulo de Spring Data para los DAO y que veremos en las clases de ORM.
