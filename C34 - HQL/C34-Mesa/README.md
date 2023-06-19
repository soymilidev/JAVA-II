
# HQL

## Desafío
Para las mesas de trabajo, te pedimos que crees un proyecto Spring Boot con Spring Data que contenga dos entidades: Veterinaria y Mascota, las cuales tendrán las siguientes entidades:

🏥 **Veterinaria:**  
● Nombre: String  
● costo: int  

¡Hay que asociarlo con las mascotas! La asociación deberá tener un **fetchType lazy**.

🐱 **Mascota:**  
● Nombre: String  
● Tipo: String —por ejemplo, perro, gato, etcétera—.  

👉En el DAO debés agregar:
- Un método que cree una nueva Veterinaria.  
- Un método para agregar mascotas a la Veterinaria.  
- Un método para consultar todas las mascotas de una Veterinaria.  
- Un método para consultar todas las mascotas que son perro.  

🚨¡Atención! Para los métodos que se heredan del repositorio, solo tenés que agregar un comentario.

¡Éxitos!

