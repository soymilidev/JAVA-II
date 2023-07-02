
# Token

Partiendo de una API para abstraernos de toda la complejidad de crear un token, descargá template.zip e importalo como un proyecto nuevo. Agregá una base de datos H2 para validar el usuario desde una base de datos. Para esto, tenés que crear la entidad User:
- password: String
- username: String

Recordá crear un repository (capa de acceso a datos) para manejar la consulta a la base de datos. Debemos llamar a esta clase desde la clase MyUserDetailsService.loadUserByUsername para validar que el usuario y contraseña son correctos.

¡Éxitos!

