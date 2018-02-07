import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Pizza> pizzasAdicionadas = new ArrayList<>();

    public void recebe(Pizza pizza) {
        if (pizza.semIngredientes()) {
            System.out.println("O Carrinho não pode aceitar que seja adicionada uma pizza sem ingredientes");
        } else {
            pizzasAdicionadas.add(pizza);
        }
    }

    public int valorTotal() {
        int total = 0;
        for (Pizza pizza: pizzasAdicionadas) {
            total += pizza.getPreco();
        }
        return total;
    }

    public void imprimeValorTotal() {
        System.out.println("Valor total de todas as pizzas adicionadas: " + valorTotal() + " reais");
    }
}
