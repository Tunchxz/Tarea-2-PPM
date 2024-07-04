package uvg.edu.gt;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcTest {

    // Instancia de la calculadora para usar en las pruebas
    private Calc calculadora = new Calc();

    @Test
    public void testSuma() {
        assertEquals(5, calculadora.suma(2, 3));
        assertEquals(-1, calculadora.suma(2, -3));
        assertEquals(0, calculadora.suma(0, 0));
        assertEquals(1000, calculadora.suma(500, 500));
    }

    @Test
    public void testResta() {
        assertEquals(-1, calculadora.resta(2, 3));
        assertEquals(5, calculadora.resta(2, -3));
        assertEquals(0, calculadora.resta(0, 0));
        assertEquals(0, calculadora.resta(500, 500));
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(6, calculadora.multiplicacion(2, 3));
        assertEquals(-6, calculadora.multiplicacion(2, -3));
        assertEquals(0, calculadora.multiplicacion(0, 0));
        assertEquals(250000, calculadora.multiplicacion(500, 500));
    }
}