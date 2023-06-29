
# Continuemos ejercitando

Al ejercicio anterior le agregamos otro endpoint que se llama crearJugador y deberá ser un POST. Para esto, creamos una clase Jugador:
- String nombre
- int numeroCamiseta
- El endpoint debe devolver el Jugador.
- El endpoint debe usar un @RequestBody para pasar el Jugador por parámetro: **public Jugador crearJugador(@RequestBody Jugador jugador)**

Al igual que el ejercicio anterior, te pedimos que generes un nuevo token. Para esto, llamamos authenticate y usamos este token desde postman para corroborar que nuestro POST tiene aún permisos para crear el jugador.

¡Éxitos!


