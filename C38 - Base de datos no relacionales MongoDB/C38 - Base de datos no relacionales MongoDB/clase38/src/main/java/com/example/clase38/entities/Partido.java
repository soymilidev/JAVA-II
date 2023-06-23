package com.example.clase38.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// @Document para indicar que esta clase se mapea a una colección en la base de datos
@Document(collection = "partidos")
public class Partido {
    // @Id para marcar el campo 'id' como el identificador único del objeto Partido
    @Id

    private Long id;
    private String resultado;
    private Estado estado;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public Partido() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "id=" + id +
                ", resultado='" + resultado + '\'' +
                ", estado=" + estado +
                ", equipoLocal=" + equipoLocal +
                ", equipoVisitante=" + equipoVisitante +
                '}';
    }
}
