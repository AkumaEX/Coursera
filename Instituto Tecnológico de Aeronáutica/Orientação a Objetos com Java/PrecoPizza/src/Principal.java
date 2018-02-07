public class Principal {

    private static Pizza criarCalabresa() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("calabresa");
        pizza.adicionaIngrediente("cebola");
        pizza.adicionaIngrediente("azeitonas");
        return pizza;
    }

    private static Pizza criarMussarela() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("mussarela");
        pizza.adicionaIngrediente("azeitonas");
        return pizza;
    }

    private static Pizza criarVegetariana() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("brócolis");
        pizza.adicionaIngrediente("ervilha");
        pizza.adicionaIngrediente("milho");
        pizza.adicionaIngrediente("champignon");
        pizza.adicionaIngrediente("palmito");
        pizza.adicionaIngrediente("mussarela");
        pizza.adicionaIngrediente("tomate");
        return pizza;
    }

    public static void main(String[] args) {

        Pizza calabresa = criarCalabresa();
        Pizza mussarela = criarMussarela();
        Pizza vegetariana = criarVegetariana();

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.recebe(calabresa);
        carrinho.recebe(mussarela);
        carrinho.recebe(vegetariana);

        carrinho.imprimeValorTotal();
        Pizza.imprimeQuantidadeDeCadaIngrediente();
    }
}
