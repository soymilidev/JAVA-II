
# Diseñando arquitecturas orientadas a microservicios

## Desafío 1
Nos contratan para mejorar un sistema de ventas online que está compuesto de la siguiente manera:

![Preview](https://github.com/soymilidev/JAVA-II/blob/main/C40%20-%20Sistemas%20Distribuidos/C40-Clase/consigna.png)

**¿Cómo podríamos dividir este sistema en varios microservicios?**
Les proponemos realizar un diseño y hacer el diagrama. Recuerden que pueden hacerlo en https://app.diagrams.net/, abrir un documento y hacer clic en ‘’insertar’’ - ‘’dibujo’’ - ‘’nuevo’’ o elegir la herramienta que ustedes deseen.

## Desafío 2
Cuando trabajamos con monolitos, para comunicarnos, siempre será la misma url. Por ejemplo: http://localhost:8081/productos o http://localhost:8081/clientes
Ahora tenemos diferentes servicios, y por lo tanto diferentes direcciones para comunicarnos con ellos. Por ejemplo alguno estará en http://localhost:8080/, otro estará en http://localhost:8081.

¿Se te ocurre cómo podríamos hacer para tener un único punto de entrada a nuestro sistema? Es decir, contar con una única url base, como en las arquitecturas monolíticas.


## Imaginemos la siguiente situación:
Tenemos los diferentes servicios de la tienda, cada uno tiene una dirección en particular, pero nosotros queremos comunicarnos con ellos, haciendo request al mismo puerto. Por ejemplo: http://localhost:8080/servicio1 o http://localhost:8080/servicio2

Les proponemos que debatan entre ustedes y propongan un diseño. 

Recuerden que pueden existir muchas soluciones a un mismo problema.

¡Éxitos!


