import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProdutoComTamanhoTest {

    ProdutoComTamanho produto1;
    ProdutoComTamanho produto2;

    @Before
    public void tarefasAntesDoTeste() {
        produto1 = new ProdutoComTamanho("Produto 1", 111, 222, 333);
        produto2 = new ProdutoComTamanho("Produto 2", 444, 555, 666);
    }

    @Test
    public void testeEqualsNomesIguais() {
        produto1.nome = "Detergente";
        produto2.nome = "Detergente";

        boolean resultado = produto1.equals(produto2);
        assertEquals(false, resultado);
    }

    @Test
    public void testeEqualsCodigosIguais() {
        produto1.codigo = 111;
        produto2.codigo = 111;

        boolean resultado = produto1.equals(produto2);
        assertEquals(false, resultado);
    }

    @Test
    public void testeEqualsPrecosIguais() {
        produto1.preco = 222;
        produto2.preco = 222;

        boolean resultado = produto1.equals(produto2);
        assertEquals(false, resultado);
    }

    @Test
    public void testeEqualsTamanhosIguais() {
        produto1.tamanho = 333;
        produto2.tamanho = 333;

        boolean resultado = produto1.equals(produto2);
        assertEquals(false, resultado);
    }

    @Test
    public void testeEqualsCodigosIguaisTamanhosIguais() {
        produto1.codigo = 111;
        produto1.tamanho = 333;

        produto2.codigo = 111;
        produto2.tamanho = 333;

        boolean resultado = produto1.equals(produto2);
        assertEquals(true, resultado);
    }

    @Test
    public void testeEqualsInstanciasIguais() {
        boolean resultado = produto1.equals(produto1);
        assertEquals(true, resultado);
    }

    @Test
    public void testeEqualsObjetosDiferentes() {
        produto1.nome = "Detergente";
        String produto2 = "Detergente";

        boolean resultado = produto1.equals(produto2);
        assertEquals(false, resultado);
    }

    @Test
    public void testeHashCodeNomesIguais() {
        produto1.nome = "Detergente";
        produto2.nome = "Detergente";

        int resultado1 = produto1.hashCode();
        int resultado2 = produto2.hashCode();

        assertEquals(false, resultado1 == resultado2);
    }

    @Test
    public void testeHashCodeCodigosIguais() {
        produto1.codigo = 111;
        produto2.codigo = 111;

        int resultado1 = produto1.hashCode();
        int resultado2 = produto2.hashCode();

        assertEquals(false, resultado1 == resultado2);
    }

    @Test
    public void testeHashCodePrecosIguais() {
        produto1.preco = 222;
        produto2.preco = 222;

        int resultado1 = produto1.hashCode();
        int resultado2 = produto2.hashCode();

        assertEquals(false, resultado1 == resultado2);
    }

    @Test
    public void testeHashCodeTamanhosIguais() {
        produto1.tamanho = 333;
        produto2.tamanho = 333;

        int resultado1 = produto1.hashCode();
        int resultado2 = produto2.hashCode();

        assertEquals(false, resultado1 == resultado2);
    }

    @Test
    public void testeHasCodeCodigosIguaisTamanhosIguais() {
        produto1.codigo = 111;
        produto1.tamanho = 333;

        produto2.codigo = 111;
        produto2.tamanho = 333;

        int resultado1 = produto1.hashCode();
        int resultado2 = produto2.hashCode();

        assertEquals(true, resultado1 == resultado2);
    }

    @Test
    public void testeHashCodeInstanciasIguais() {
        int resultado1 = produto1.hashCode();

        assertEquals(true, resultado1 == resultado1);
    }

    @Test
    public void testeHashCodeObjetosDiferentes() {
        produto1.nome = "Detergente";
        String produto2 = "Detergente";

        int resultado1 = produto1.hashCode();
        int resultado2 = produto2.hashCode();

        assertEquals(false, resultado1 == resultado2);
    }

    @Test
    public void testeHashCodeObjetosDiferentesHashCodeIgual() {
        Integer codigo = 111;
        Integer tamanho = 333;
        Integer produto2 = codigo.hashCode() + tamanho.hashCode();

        int resultado1 = produto1.hashCode();
        int resultado2 = produto2.hashCode();

        assertEquals(true, resultado1 == resultado2);
    }
}