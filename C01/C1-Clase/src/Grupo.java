import java.util.ArrayList;
import java.util.List;

public class Grupo {
    //"personas" es una lista que puede contener objetos del tipo "Persona".
    // "private" la variable solo es accesible dentro de la clase "Grupo".
    private List<Persona> personas;

    //Metodos
    //La clase "ArrayList" es una clase que implementa la interfaz "List".
    public Grupo() {
        personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        if (persona.esAdmitida()) {
            personas.add(persona);
        }
    }

    public int getCantidadPersonas() {
        return personas.size();
    }
}