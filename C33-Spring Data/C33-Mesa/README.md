
# Proyecto de Fútbol

## Objetivo
Agregar una mayor complejidad al ejercicio de la clase asincrónica. Tal como mencionamos anteriormente, para comenzar con esta actividad tenés que tener:  
✅ La relación 1:M entre equipos y jugadores.  
✅ Haber generado la base de datos desde Springboots usando H2 en memoria.  

## Desafío
Recordemos… las entidades del proyecto de fútbol son:  

● **Jugador:**  
○ Nombre: String.  
○ Puesto: String (Delantero, defensor, etc.).  
○ Numero: int.  

● **Equipo:**  
○ Nombre: String.  
○ Ciudad: String.  

Ahora, el nuevo desafío consiste en agregar un fetchtype LAZY a la lista de jugadores y agregar cascade para que, si se elimina un equipo de fútbol, se eliminen todos los jugadores.

¡Éxitos!
