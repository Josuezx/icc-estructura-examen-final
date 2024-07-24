package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import main.Controlador.EstudianteController;
import main.Modelo.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", 85));
        estudiantes.add(new Estudiante("María", 92));
        estudiantes.add(new Estudiante("Pedro", 78));
        estudiantes.add(new Estudiante("Ana", 88));
        estudiantes.add(new Estudiante("Luis", 75));

        EstudianteController controller = new EstudianteController();
        List<Estudiante> estudiantesOrdenados = controller.ordenarEstudiantes(estudiantes);
        System.out.println("Estudiantes ordenados por calificación:");
        for (Estudiante estudiante : estudiantesOrdenados) {
            System.out.println(estudiante);
        }

        // Agrupar estudiantes por categoría
        Map<String, List<Estudiante>> categorias = controller.procesarEstudiantes(estudiantes);
        System.out.println("Agrupación por categorías:");
        for (Map.Entry<String, List<Estudiante>> entry : categorias.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
    }
}
