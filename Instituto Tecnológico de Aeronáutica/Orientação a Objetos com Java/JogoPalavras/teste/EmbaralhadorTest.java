import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmbaralhadorTest {

    Embaralhador inverso;
    Embaralhador permutado;

    @Before
    public void tarefasAntesDoTeste() {
        inverso = new Inverso();
        permutado = new Permutado();
    }

    @Test
    public void testaInversoString() {
        String resultado = inverso.embaralha("Animal");
        assertEquals("lamina", resultado);
    }

    @Test
    public void testaInversoStringComEspacos() {
        String resultado = inverso.embaralha("Animal racional");
        assertEquals("lanoicar lamina", resultado);
    }

    @Test
    public void testaInversoNumeros() {
        String resultado = inverso.embaralha("0123456789");
        assertEquals("9876543210", resultado);
    }

    @Test
    public void testaPermutadoStringPar() {
        String resultado = permutado.embaralha("Animal");
        assertEquals("namila", resultado);
    }

    @Test
    public void testaPermutadoStringImpar() {
        String resultado = permutado.embaralha("Animais");
        assertEquals("namiias", resultado);
    }

    @Test
    public void testaPermutadoStringComEspacos() {
        String resultado = permutado.embaralha("Animal racional");
        assertEquals("namilar caoianl", resultado);
    }

    @Test
    public void testaPermutadoNumeros() {
        String resultado = permutado.embaralha("0123456789");
        assertEquals("1032547698", resultado);
    }
}