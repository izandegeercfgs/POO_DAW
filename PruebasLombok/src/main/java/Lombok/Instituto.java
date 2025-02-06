package Lombok;

import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@ToString
public class Instituto {
    private final String nombre;
    private String poblacion;
    private final Set<Estudiante> listaEstudiantes = new HashSet<>();
    private final Set<Curso> listaCursos = new HashSet<>();

    public Instituto(String nombre) {
        this.nombre = (nombre != null) ? nombre : "Instituto sin nombre";
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante == null) {
            System.out.println("No se puede añadir un estudiante nulo.");
            return;
        }
        listaEstudiantes.add(estudiante);
    }

    public void agregarCurso(Curso curso) {
        if (curso == null) {
            System.out.println("No se puede añadir un curso nulo.");
            return;
        }
    }
}