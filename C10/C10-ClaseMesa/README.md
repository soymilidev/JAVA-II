
# Logging – Librería Log4j

Les pedimos crear una aplicación que calcule el promedio de valores, el máximo y el mínimo en una lista de enteros:
List<Integer> listaEnteros

Deben loguear:
- Cuando la lista tiene más de 5 elementos.
- Cuando la lista tiene más de 10 elementos.
- El promedio.
- Arrojar un error si la lista no tiene elementos, y registrarlo en los logs.

Luego, deben crear una clase main, donde creamos una lista para cada uno de los ítems y chequear que los logs existan. 

La salida debe ser algo como:  
[2021-07-18 18:15:11] [ INFO ] [ListaPromedio:16] La longitud de la lista es mayor a 5  
[2021-07-18 18:15:11] [ INFO ] [ListaPromedio:16] La longitud de la lista es mayor a 5  
[2021-07-18 18:15:11] [ INFO ] [ListaPromedio:19] La longitud de la lista es mayor a 10  
[2021-07-18 18:15:11] [ ERROR] [Test:24] La lista es igual a cero

java.lang.Exception  
at com.logging.ListaPromedio.<init>(ListaPromedio.java:22)  
at com.logging.Test.main(Test.java:22)  


