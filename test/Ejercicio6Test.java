import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio6Test {

    @Test
    void esHyperpar() {
        assertAll(
            () ->  assertTrue(Ejercicio6.esHyperpar(202)),
            () ->  assertTrue(Ejercicio6.esHyperpar(8024))
        );
    }
    @Test
    void noEsHyperpar() {
        assertAll(
                () ->  assertFalse(Ejercicio6.esHyperpar(203)),
                () ->  assertFalse(Ejercicio6.esHyperpar(1025))
        );
    }
}