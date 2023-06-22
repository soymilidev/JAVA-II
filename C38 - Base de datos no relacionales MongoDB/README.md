
# Fixture web


Continuamos con el proyecto para la casa de apuestas. 

Para esta etapa vas a **modelar los partidos**.

Ya que el acceso a esta información será de forma masiva y recurrente, vas a utilizar una base de datos no relacional, en este caso MongoDB.

Luego del relevamiento obtuviste que un **partido** está compuesto por:  
● ID.  
● Estado (Calendario, Por comenzar, En vivo, Finalizado).  
● Resultado.  
● Equipo local.  
○ ID.  
○ Nombre.  
○ País.  

● Equipo visitante  
○ ID.  
○ Nombre.  
○ País.  

¿Cuáles son los requerimientos?  
● Configurar la conexión en application.properties para conectarte a la base de datos “apuestas”.  
● Agregar las clases necesarias (Model, Controller, Service, Repository).  
● La API de los partidos deberá permitirte:  
○ Agregar partidos.  

¡Éxitos!