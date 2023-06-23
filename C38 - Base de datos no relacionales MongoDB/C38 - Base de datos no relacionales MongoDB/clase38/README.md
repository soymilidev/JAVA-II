
# Fixture web

## C38 - Clase

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


## C38 - Mesa

🚨 Esta actividad es una continuidad de la realizada con el docente. Por lo tanto, si aún no pudiste terminarla te recomendamos seguir con la misma. En caso de haber terminado, te proponemos un nuevo desafío.


Recordá que los requerimientos de la actividad anterior eran:  
● Configurar la conexión en application.properties para conectarte a la base de datos “apuestas”.  
● Agregar las clases necesarias (Model, Controller, Service, Repository).  

Ahora que ya sabes cómo agregar partidos, te proponemos que te animes a sumar la siguiente funcionalidad:  
○ Listar todos los partidos.  
○ Listar partidos en vivo.  

¡Manos a la obra!