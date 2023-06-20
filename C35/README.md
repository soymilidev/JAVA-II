
# Proyecto clínica odontológica

## Enunciado

### Objetivo
El objetivo de esta actividad es continuar realizando mejoras a nuestro proyecto de la
clínica odontológica.

### Desafío I
En nuestro proyecto ya tenemos todas las APIs que necesitamos:  
✅Pacientes  
✅Odontólogos  
✅Turnos  

Ahora que nuestro back end cubre todas las necesidades del cliente, llegó el momento de hacerlo más eficiente y escalable.

👀 Para esta etapa vamos a refactorizar por completo la capa de
persistencia.

Nuestro chapter lead nos pide que implementemos Spring Data en nuestro sistema. Para ello debemos:  
● Agregar las anotaciones necesarias en las entidades Paciente y Domicilio para que Spring cree automáticamente las tablas, columnas y las relaciones de dichas entidades en la base de datos.  
● Crear nuevas clases en nuestra capa de persistencia (Paquete repository) que implementen JPARepository. Por ejemplo: AlumnoRepository.  
● Utilizar estas clases que implementan JPARepository en la capa de servicio.

👉 Luego, probá el correcto funcionamiento ejecutando los tests desarrollados anteriormente o con Postman

### Desafío II
Para continuar con la refactorización de la capa de persistencia, ahora el chapter lead nos pide:  
● Agregar las anotaciones necesarias en las entidades Odontólogo y Turno para que Spring cree automáticamente las tablas, columnas y las relaciones de dichas entidades en la base de datos.  
● Crear nuevas clases en nuestra capa de persistencia (Paquete repository) que implementen JPARepository. Por ejemplo: AlumnoRepository, OdontologoRepository, TurnoRepository.  
● Utilizar estas clases que implementan JPARepository en la capa de servicio.  

👉 Al igual que en el desafío anterior, no te olvides de probar el correcto funcionamiento ejecutando los tests desarrollados anteriormente o con Postman.

¡Éxitos!