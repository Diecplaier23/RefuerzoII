import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio3Test {

    @Test
    void sumaDigitos() {
        assertAll(
                ()->assertEquals("3 + 4 + 3 + 3 = 13", Ejercicio3.sumaDigitos("3433").trim()),
                ()->assertEquals("5 + 1 + 0 + 8 = 14", Ejercicio3.sumaDigitos("5108").trim()));
    }
}