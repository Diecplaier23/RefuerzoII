import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio10Test {

    @Test
    void litros() {
        assertAll(
                () -> assertEquals(1400, Ejercicio10.litros(5, 300, 10)),
                () -> assertEquals(1480, Ejercicio10.litros(4, 400, 20))
        );
    }
}