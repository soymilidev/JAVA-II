
# Proyecto clínica odontológica
## Agregando tests de integración

Nuestro chapter lead nos pide:
- Realizar test de integración para el controller de turnos.
- Utilizando MockMvc, testear el endpoint que nos retorna un listado de turnos.
- El test debe comprobar que el código de respuesta es 200 y que en el body nos retorna un listado de turnos con datos.
Recordar cargar por lo menos un turno antes de ejecutar el test, para asegurarnos que tengamos información en la base de datos.

**Ayuda extra:**  
Para ejecutar los test sin que la seguridad de la api nos lo impida, agregar el parámetro addFilters = false en @AutoConfigureMockMvc

Por ejemplo:

```java
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
public class IntegrationPacienteTest {
//test1

//test2

}
```

¡Éxitos!

