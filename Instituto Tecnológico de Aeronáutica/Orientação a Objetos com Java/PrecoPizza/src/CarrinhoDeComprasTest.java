import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarrinhoDeComprasTest {

    CarrinhoDeCompras carrinho;

    @Before
    public void tarefasAntesDoTeste() {
        Pizza.zeraRegistroDeIngredientes();
        carrinho = new CarrinhoDeCompras();
    }

    @Test
    public void testaPrecoComUmaPizzaSemIngredientes() {
        Pizza pizza0 = new Pizza();
        carrinho.recebe(pizza0);
        assertEquals(0, carrinho.valorTotal());
    }

    @Test
    public void testaPrecoComUmaPizzaDeQuinze() {
        Pizza pizza15 = new Pizza();
        pizza15.adicionaIngrediente("ingrediente 1");
        pizza15.adicionaIngrediente("ingrediente 2");
        carrinho.recebe(pizza15);
        assertEquals(15, carrinho.valorTotal());
    }

    @Test
    public void testaPrecoComUmaPizzaDeVinte() {
        Pizza pizza20 = new Pizza();
        pizza20.adicionaIngrediente("ingrediente 1");
        pizza20.adicionaIngrediente("ingrediente 2");
        pizza20.adicionaIngrediente("ingrediente 3");
        pizza20.adicionaIngrediente("ingrediente 4");
        carrinho.recebe(pizza20);
        assertEquals(20, carrinho.valorTotal());
    }

    @Test
    public void testaPrecoComUmaPizzaDeVinteETres() {
        Pizza pizza23 = new Pizza();
        pizza23.adicionaIngrediente("ingrediente 1");
        pizza23.adicionaIngrediente("ingrediente 2");
        pizza23.adicionaIngrediente("ingrediente 3");
        pizza23.adicionaIngrediente("ingrediente 4");
        pizza23.adicionaIngrediente("ingrediente 5");
        pizza23.adicionaIngrediente("ingrediente 6");
        carrinho.recebe(pizza23);
        assertEquals(23, carrinho.valorTotal());
    }

    @Test
    public void testaPrecoComDuasPizzasComValoresIguais() {
        Pizza pizza15;

        pizza15 = new Pizza();
        pizza15.adicionaIngrediente("ingrediente 1");
        pizza15.adicionaIngrediente("ingrediente 2");
        carrinho.recebe(pizza15);

        pizza15 = new Pizza();
        pizza15.adicionaIngrediente("ingrediente 1");
        pizza15.adicionaIngrediente("ingrediente 2");
        carrinho.recebe(pizza15);

        assertEquals(30, carrinho.valorTotal());
    }

    @Test
    public void testaPrecocomDuasPizzasComValoresDiferentes() {
        Pizza pizza15 = new Pizza();
        pizza15.adicionaIngrediente("ingrediente 1");
        pizza15.adicionaIngrediente("ingrediente 2");
        carrinho.recebe(pizza15);

        Pizza pizza20 = new Pizza();
        pizza20.adicionaIngrediente("ingrediente 1");
        pizza20.adicionaIngrediente("ingrediente 2");
        pizza20.adicionaIngrediente("ingrediente 3");
        pizza20.adicionaIngrediente("ingrediente 4");
        carrinho.recebe(pizza20);

        assertEquals(35, carrinho.valorTotal());
    }

    @Test
    public void testaPrecocomTresPizzasComValoresDiferentes() {
        Pizza pizza15 = new Pizza();
        pizza15.adicionaIngrediente("ingrediente 1");
        pizza15.adicionaIngrediente("ingrediente 2");
        carrinho.recebe(pizza15);

        Pizza pizza20 = new Pizza();
        pizza20.adicionaIngrediente("ingrediente 1");
        pizza20.adicionaIngrediente("ingrediente 2");
        pizza20.adicionaIngrediente("ingrediente 3");
        pizza20.adicionaIngrediente("ingrediente 4");
        carrinho.recebe(pizza20);

        Pizza pizza23 = new Pizza();
        pizza23.adicionaIngrediente("ingrediente 1");
        pizza23.adicionaIngrediente("ingrediente 2");
        pizza23.adicionaIngrediente("ingrediente 3");
        pizza23.adicionaIngrediente("ingrediente 4");
        pizza23.adicionaIngrediente("ingrediente 5");
        pizza23.adicionaIngrediente("ingrediente 6");
        carrinho.recebe(pizza23);

        assertEquals(58, carrinho.valorTotal());
    }
}