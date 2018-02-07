import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarrinhoDeComprasTest {

    CarrinhoDeCompras carrinho;
    Produto produto1;
    Produto produto2;
    ProdutoComTamanho produto3;
    ProdutoComTamanho produto4;

    @Before
    public void tarefasAntesDoTeste() {
        carrinho = new CarrinhoDeCompras();
        produto1 = new Produto("produto 1", 111, 222);
        produto2 = new Produto("produto 2", 333, 444);
        produto3 = new ProdutoComTamanho("produto 3", 555, 666, 777);
        produto4 = new ProdutoComTamanho("produto 4", 888, 999, 000);
    }

    @Test
    public void testeAdicionaUmProduto() {
        carrinho.adicionaProduto(produto1, 3);
        assertEquals(666, carrinho.calculaValorTotal());
    }

    @Test
    public void testeAdicionaUmProdutoComTamanho() {
        carrinho.adicionaProduto(produto3, 3);
        assertEquals(1998, carrinho.calculaValorTotal());
    }

    @Test
    public void testeAdicionaDoisProdutosDiferentes() {
        carrinho.adicionaProduto(produto2, 2);
        carrinho.adicionaProduto(produto4, 2);
        assertEquals(2886, carrinho.calculaValorTotal());
    }

    @Test
    public void testeRemoveProdutosIguais() {
        produto2.codigo = produto1.codigo;
        carrinho.adicionaProduto(produto1, 3);
        carrinho.removeProduto(produto2, 2);
        assertEquals(222, carrinho.calculaValorTotal());
    }

    @Test
    public void testeRemoveProdutosComTamanhosIguais() {
        produto4.codigo = produto3.codigo;
        produto4.tamanho = produto3.tamanho;
        carrinho.adicionaProduto(produto3, 9);
        carrinho.removeProduto(produto4, 8);
        assertEquals(666, carrinho.calculaValorTotal());
    }

    @Test
    public void testeRemoveMaisDoQueExiste() {
        carrinho.adicionaProduto(produto1, 3);
        carrinho.removeProduto(produto1, 5);
        assertEquals(0, carrinho.calculaValorTotal());
    }

    @Test
    public void testeRemoveOQueNaoExiste() {
        carrinho.removeProduto(produto1, 3);
        assertEquals(0, carrinho.calculaValorTotal());
    }
}