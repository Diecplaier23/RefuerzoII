import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio8Test {

    @Test
    void cual() {
        assertAll(
                () -> assertEquals(3, Ejercicio8.cualFalta(new int[]{4, 5, 2, 1})),
                () -> assertEquals(6, Ejercicio8.cualFalta(new int[]{4, 7, 2, 5, 3}))
        );
    }
}