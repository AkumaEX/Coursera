import org.junit.Test;

import static org.junit.Assert.*;

public class AutoridadeTest {

    FormatadorNome formatador;
    Autoridade autoridade;

    @Test
    public void testeInformal() {
        formatador = new Informal();
        autoridade = new Autoridade("Pedro", "Cabral", formatador);
        assertEquals("Pedro", autoridade.getTratamento());
    }

    @Test
    public void testeRespeitosoMasculino() {
        formatador = new Respeitoso(true);
        autoridade = new Autoridade("Pedro", "Cabral", formatador);
        assertEquals("Sr. Cabral", autoridade.getTratamento());
    }

    @Test
    public void testeRespeitosoFeminino() {
        formatador = new Respeitoso(false);
        autoridade = new Autoridade("Pedro", "Cabral", formatador);
        assertEquals("Sra. Cabral", autoridade.getTratamento());
    }

    @Test
    public void testeComTituloMagnifico() {
        formatador = new ComTitulo("Magnífico");
        autoridade = new Autoridade("Pedro", "Cabral", formatador);
        assertEquals("Magnífico Pedro Cabral", autoridade.getTratamento());
    }

    @Test
    public void testeComTituloExcelentissimo() {
        formatador = new ComTitulo("Excelentíssimo");
        autoridade = new Autoridade("Pedro", "Cabral", formatador);
        assertEquals("Excelentíssimo Pedro Cabral", autoridade.getTratamento());
    }
}