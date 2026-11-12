import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio5Test {

    @Test
    @DisplayName("Número impar de elementos")
    void medianaNumeroImpar() {
        assertEquals(4.0, Ejercicio5.mediana(new int[]{5, 7, 4, 3, 1}));
    }

    @Test
    @DisplayName("Número par de elementos")
    void medianaNumeroPar() {
        assertEquals(4.5, Ejercicio5.mediana(new int[]{5, 7, 4, 3, 1, 6}));
    }
}
