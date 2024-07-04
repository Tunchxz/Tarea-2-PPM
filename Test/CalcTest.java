package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    private final InputStream systemIn = System.in;
    private ByteArrayInputStream testIn;

    @Before
    public void setUpInput() {
        // Redirigir la entrada estándar para poder simular entradas de usuario
        String input = "5\n3\n"; // Simular entrada de "5" y "3"
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
    }

    @After
    public void restoreSystemInputOutput() {
        // Restaurar la entrada estándar después de las pruebas
        System.setIn(systemIn);
    }

    @Test
    public void testSuma() {
        Calc calc = new Calc();
        calc.suma();
        assertEquals("Su resultado es: 8", systemOut().trim());
    }

    @Test
    public void testResta() {
        Calc calc = new Calc();
        calc.resta();
        assertEquals("Su resultado es: 2", systemOut().trim());
    }

    @Test
    public void testMultiplicacion() {
        Calc calc = new Calc();
        calc.multiplicacion();
        assertEquals("Su resultado es: 15", systemOut().trim());
    }

    private String systemOut() {
        // Capturar la salida estándar para poder verificarla
        return testOut.toString();
    }
}