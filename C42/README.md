
# Proyecto paquetería - Parte II

Ahora, el chapter lead pide:
- Lanzar la excepción BadRequestException desde el servicio de paquetes, en el caso de que se intente registrar un paquete sin los datos de destino.
- Utilizando @ExceptionHandler, crear un método en el controller de los paquetes, para procesar esta excepción lanzada desde el servicio de paquetes.
- Retornar un ResponseEntity con código 400 (BAD REQUEST) y en el body un mensaje descriptivo del error.

Por último, debés probar desde postman el correcto funcionamiento.

¡Éxitos!


