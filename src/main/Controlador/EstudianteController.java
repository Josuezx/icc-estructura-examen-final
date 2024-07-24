package main.Controlador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.Modelo.Estudiante;

import java.util.*;

public class EstudianteController {

    public List<Estudiante> ordenarEstudiantes(List<Estudiante> estudiantes) {
        estudiantes.sort(Comparator.comparingInt(Estudiante::getCalificacion));
        return estudiantes;
    }

    public Map<String, List<Estudiante>> procesarEstudiantes(List<Estudiante> estudiantes) {
        Map<String, List<Estudiante>> categorias = new HashMap<>();

        for (Estudiante estudiante : estudiantes) {
            String categoria = obtenerCategoria(estudiante.getCalificacion());
            categorias.computeIfAbsent(categoria, k -> new ArrayList<>()).add(estudiante);
        }

        return categorias;
    }

    public String obtenerCategoria(int calificacion) {
        if (calificacion >= 90) {
            return "A";
        } else if (calificacion >= 80) {
            return "B";
        } else if (calificacion >= 70) {
            return "C";
        } else if (calificacion >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
