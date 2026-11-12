import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio4Test {

    @Test
    void moda() {
        assertAll(
                () -> assertEquals(5, Ejercicio4.moda(new int[]{1, 3, 5, 5, 5, 3, 2, 1, 3, 3, 5, 5})),
                () -> assertEquals(2, Ejercicio4.moda(new int[]{1, 3, 2, 2, 5, 3, 2, 1, 4, 12, 5, 5}))
        );
    }
}