package test;
import main.Controlador.Ejercicios;


import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class EjerciciosTest {

    @Test
    public void testContarFrecuenciaDePalabras() {
        String text = "Esta es una prueba. Esta prueba es solo una prueba.";
        Map<String, Integer> wordCount = Ejercicios.contarFrecuenciaDePalabras(text);

        assertEquals(2, wordCount.get("esta"));
        assertEquals(2, wordCount.get("es"));
        assertEquals(2, wordCount.get("una"));
        assertEquals(2, wordCount.get("prueba."));
        assertEquals(1, wordCount.get("solo"));
    }

    @Test
    public void testVerificarCaracteresUnicos_True() {
        String input = "abcdefg";
        boolean result = Ejercicios.verificarCaracteresUnicos(input);
        assertTrue(result);
    }

    @Test
    public void testVerificarCaracteresUnicos_False() {
        String input = "hello";
        boolean result = Ejercicios.verificarCaracteresUnicos(input);
        assertFalse(result);
    }
    


}
