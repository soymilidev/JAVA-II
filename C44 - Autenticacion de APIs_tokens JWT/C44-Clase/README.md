
# Autenticación de APIs basada en tokens JWT

Vamos a utilizar una API para abstraernos de toda la complejidad de crear un token, la encontramos en el archivo template.zip, y debemos importarla como un proyecto nuevo y arrancar desde ahí.

Tenemos que agregar un nuevo endpoint que sea GET (**/goodbye**), que se llame goodbye, el mismo debe retornar un String que diga, “Adios JWT”.

- Invocar desde postman al endpoint **/authenticate** para generar un token. El body que debemos usar es {"username" : "foo", "password" : "foo"} y después debemos usar este token para invocar al endpoint /goodbye —todas las APIs excepto /authenticate necesitarán del token para poder funcionar—.

- Probar la invocación al endpoint **/authenticate** utilizando un usuario y password incorrecto.

- Probar la invocación al endpoint **/goodbye** utilizando un token incorrecto, simplemente cambiando parte del string del token.

**Importante: Recordar que la clase MyUserDetailsService contiene el método loadUserByUsername que devuelve el usuario para validar. Esta clase y método es el que se utiliza cuando se invoca a la API que genera el Token JWT para comprobar el usuario y el password.**


