import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2Test {

    @Test
    void diasHastaNochevieja() {
        assertAll(
                () -> assertEquals(364, Ejercicio2.diasHastaNochevieja(1, 1)),
                () -> assertEquals(0, Ejercicio2.diasHastaNochevieja(31, 12)),
                () -> assertEquals(209, Ejercicio2.diasHastaNochevieja(5, 6))
        );
    }
}