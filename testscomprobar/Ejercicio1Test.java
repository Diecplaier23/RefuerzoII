import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {

    @org.junit.jupiter.api.Test
    void ascendente() {
        assertEquals("Ascendente", Ejercicio1.orden(new int[]{5, 6, 7, 7, 8}));
    }
    @org.junit.jupiter.api.Test
    void descendente() {
        assertEquals("Descendente", Ejercicio1.orden(new int[]{8, 7, 5, 4, 3}));
    }

    @org.junit.jupiter.api.Test
    void iguales() {
        assertEquals("Iguales", Ejercicio1.orden(new int[]{5, 5, 5, 5, 5}));
    }

    @org.junit.jupiter.api.Test
    void desordenado() {
        assertEquals("Desordenado", Ejercicio1.orden(new int[]{5, 6, 7, 6, 8}));
    }
}