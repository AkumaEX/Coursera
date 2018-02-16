import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BancoDePalavrasTest {

    BancoDePalavras banco;

    @Before
    public void tarefasAntesDoTeste() {
        banco = new BancoDePalavras();
    }

    @Test
    public void testeCarregaCerto() {
        List<String> lista = banco.getLista();
        assertEquals("arara", lista.get(0));
        assertEquals("baleia", lista.get(1));
        assertEquals("cachorro", lista.get(2));
        assertEquals("crocodilo", lista.get(3));
        assertEquals("elefante", lista.get(4));
        assertEquals("gato", lista.get(5));
        assertEquals("golfinho", lista.get(6));
        assertEquals("jacaré", lista.get(7));
        assertEquals("leão", lista.get(8));
        assertEquals("macaco", lista.get(9));
        assertEquals("onça", lista.get(10));
        assertEquals("papagaio", lista.get(11));
        assertEquals("peixe", lista.get(12));
        assertEquals("pombo", lista.get(13));
        assertEquals("rato", lista.get(14));
        assertEquals("sapo", lista.get(15));
        assertEquals("serpente", lista.get(16));
        assertEquals("tartaruga", lista.get(17));
        assertEquals("tigre", lista.get(18));
        assertEquals("tubarão", lista.get(19));
    }
}