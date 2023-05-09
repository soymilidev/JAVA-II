public class Persona {
    //Atributos
    private String nombre;
    private int edad;

    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe ser un número entre 0 y 120.");
        }
    }

    //Getters para los atributos
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //Metodos
    //Matches sirve para verificar si una cadena cumple con una expresión regular x.
    public boolean esAdmitida() {
        return edad > 18 && nombre.matches("[a-zA-Z]{5,}");
    }
}