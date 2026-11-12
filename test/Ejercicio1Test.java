import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ejercicio1Test {

    @Test
    void ascendente() {
        assertEquals("Ascendente", Ejercicio1.orden(new int[]{5, 6, 7, 7, 8}));
    }

    @Test
    void descendente() {
        assertEquals("Descendente", Ejercicio1.orden(new int[]{8, 7, 5, 4, 3}));
    }

    @Test
    void iguales() {
        assertEquals("Iguales", Ejercicio1.orden(new int[]{5, 5, 5, 5, 5}));
    }

    @Test
    void desordenado() {
        assertEquals("Desordenado", Ejercicio1.orden(new int[]{5, 6, 7, 6, 8}));
    }
}
