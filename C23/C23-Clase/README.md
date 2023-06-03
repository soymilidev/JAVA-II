
# Proyecto clínica odontológica

## Enunciado

## Desafío 1
Te pedimos que crees un proyecto en Spring Boot y agregues las dependencias Spring Web y Thymeleaf. Para ello, debemos armar la estructura para agregar servicios en un paquete servicios, un paquete controller y un paquete dominio. Luego, agregar el dominio Paciente junto con sus servicios y controllers.

Los datos de paciente son:
- Paciente (ID, Apellido, Nombre, Email, DNI, Fecha ingreso)  
- Domicilio (Calle, Número, Localidad, Provincia)  

¿Qué debemos hacer?
- Crear dos métodos en el servicio: uno que devuelva todos los pacientes y otro que devuelva el paciente según su email.  
- Crear una vista index.html que devuelva: Hola Paciente ${nombre} ${apellido}

## Desafío 2
En el mismo proyecto anterior, vamos a agregar una entidad Odontólogo.

Los datos del mismo son:
- Odontologo (ID, Apellido, Nombre, Matrícula)

¿Qué debemos hacer?
- Agregar una dependencia odontólogo en el paciente, para después relacionarlos.
- Crear dos métodos en el servicio: uno que devuelva todos los odontólogos y otro que devuelva el odontólogo por su ID.
- En la misma vista del ejercicio anterior mostrar: Hola odontólogo ${matricula
