import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio9Test {

    @Test
    void dividirFactoriales() {
        assertAll(
                () -> assertEquals(60, Ejercicio9.dividirFactoriales(5, 2)),
                () -> assertEquals(6, Ejercicio9.dividirFactoriales(6, 5)),
                () -> assertEquals(6720, Ejercicio9.dividirFactoriales(8, 3)),
                () -> assertEquals(2162160, Ejercicio9.dividirFactoriales(14, 8))

        );
    }
}