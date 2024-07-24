package main.Controlador;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicios {

    public static Map<String, Integer> contarFrecuenciaDePalabras(String text) {
        Map<String, Integer> frecuencia = new HashMap<>();
        String[] palabras = text.split("\\W+");

        for (String palabra : palabras) {
            palabra = palabra.toLowerCase();
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
        }

        return frecuencia;
    }

    public static boolean verificarCaracteresUnicos(String input) {
        Set<Character> caracteres = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (!caracteres.add(c)) {
                return false;
            }
        }

        return true;
    }
}
