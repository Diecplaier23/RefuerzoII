import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncadenandoPalabrasTest {

    @Test
    void jugar() {
        assertAll(
                () -> assertTrue(EncadenandoPalabras.jugar("gugutata")),
                () -> assertTrue(EncadenandoPalabras.jugar("mata tapa papa pato")),
                () -> assertFalse(EncadenandoPalabras.jugar("seto taco coma matute")),
                () -> assertTrue(EncadenandoPalabras.jugar("sien encima mapa patuco comida")),
                () -> assertTrue(EncadenandoPalabras.jugar("cata tasama malote tejaba batama")),
                () -> assertFalse(EncadenandoPalabras.jugar("kiosko comida"))
        );
    }
}