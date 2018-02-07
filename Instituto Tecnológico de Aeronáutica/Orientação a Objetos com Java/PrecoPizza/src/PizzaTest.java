import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaTest {

    Pizza pizza;

    @Before
    public void tarefasAntesDoTeste() {
        Pizza.zeraRegistroDeIngredientes();
        pizza = new Pizza();
    }

    @Test
    public void testaPrecoComUmIngrediente() {
        pizza.adicionaIngrediente("ingrediente 1");
        assertEquals(15, pizza.getPreco());
    }

    @Test
    public void testaPrecoComDoisIngredientes() {
        pizza.adicionaIngrediente("ingrediente 1");
        pizza.adicionaIngrediente("ingrediente 2");
        assertEquals(15, pizza.getPreco());
    }

    @Test
    public void testaPrecoComTresIngredientes() {
        pizza.adicionaIngrediente("ingrediente 1");
        pizza.adicionaIngrediente("ingrediente 2");
        pizza.adicionaIngrediente("ingrediente 3");
        assertEquals(20, pizza.getPreco());
    }

    @Test
    public void testaPrecoComQuatroIngredientes() {
        pizza.adicionaIngrediente("ingrediente 1");
        pizza.adicionaIngrediente("ingrediente 2");
        pizza.adicionaIngrediente("ingrediente 3");
        pizza.adicionaIngrediente("ingrediente 4");
        assertEquals(20, pizza.getPreco());
    }

    @Test
    public void testaPrecoComCincoIngredientes() {
        pizza.adicionaIngrediente("ingrediente 1");
        pizza.adicionaIngrediente("ingrediente 2");
        pizza.adicionaIngrediente("ingrediente 3");
        pizza.adicionaIngrediente("ingrediente 4");
        pizza.adicionaIngrediente("ingrediente 5");
        assertEquals(20, pizza.getPreco());
    }

    @Test
    public void testaPrecoComSeisIngredientes() {
        pizza.adicionaIngrediente("ingrediente 1");
        pizza.adicionaIngrediente("ingrediente 2");
        pizza.adicionaIngrediente("ingrediente 3");
        pizza.adicionaIngrediente("ingrediente 4");
        pizza.adicionaIngrediente("ingrediente 5");
        pizza.adicionaIngrediente("ingrediente 6");
        assertEquals(23, pizza.getPreco());
    }

    @Test
    public void testaPrecoComSeteIngredientes() {
        pizza.adicionaIngrediente("ingrediente 1");
        pizza.adicionaIngrediente("ingrediente 2");
        pizza.adicionaIngrediente("ingrediente 3");
        pizza.adicionaIngrediente("ingrediente 4");
        pizza.adicionaIngrediente("ingrediente 5");
        pizza.adicionaIngrediente("ingrediente 6");
        pizza.adicionaIngrediente("ingrediente 7");
        assertEquals(23, pizza.getPreco());
    }

    @Test
    public void testaRegistroComUmIngrediente() {
        pizza.adicionaIngrediente("ingrediente 1");
        int quantidade = Pizza.ingredientesUtilizados.get("ingrediente 1");
        assertEquals(1, quantidade);
    }

    @Test
    public void testaRegistroComDoisIngredientes() {
        pizza.adicionaIngrediente("ingrediente 1");
        pizza.adicionaIngrediente("ingrediente 1");
        int quantidade = Pizza.ingredientesUtilizados.get("ingrediente 1");
        assertEquals(2, quantidade);
    }

    @Test
    public void testaRegistroComDoisIngredientesDiferentes() {
        pizza.adicionaIngrediente("ingrediente 1");
        pizza.adicionaIngrediente("ingrediente 2");
        pizza.adicionaIngrediente("ingrediente 2");
        int quantidade1 = Pizza.ingredientesUtilizados.get("ingrediente 1");
        int quantidade2 = Pizza.ingredientesUtilizados.get("ingrediente 2");
        assertEquals(1, quantidade1);
        assertEquals(2, quantidade2);
    }

    @Test
    public void testaRegistroComTresIngredientesDiferentes() {
        pizza.adicionaIngrediente("ingrediente 1");
        pizza.adicionaIngrediente("ingrediente 2");
        pizza.adicionaIngrediente("ingrediente 2");
        pizza.adicionaIngrediente("ingrediente 3");
        pizza.adicionaIngrediente("ingrediente 3");
        pizza.adicionaIngrediente("ingrediente 3");
        int quantidade1 = Pizza.ingredientesUtilizados.get("ingrediente 1");
        int quantidade2 = Pizza.ingredientesUtilizados.get("ingrediente 2");
        int quantidade3 = Pizza.ingredientesUtilizados.get("ingrediente 3");
        assertEquals(1, quantidade1);
        assertEquals(2, quantidade2);
        assertEquals(3, quantidade3);
    }
}