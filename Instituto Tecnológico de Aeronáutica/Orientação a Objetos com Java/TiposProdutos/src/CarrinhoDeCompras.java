import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

    protected Map<Produto, Integer> carrinho = new HashMap<>();

    public void adicionaProduto(Produto produto, int quantidade) {
        if (carrinho.containsKey(produto)) {
            int total = carrinho.get(produto) + quantidade;
            carrinho.put(produto, total);
        } else {
            carrinho.put(produto, quantidade);
        }
    }

    public void removeProduto(Produto produto, int quantidade) {
        if (carrinho.containsKey(produto)) {
            int restante = carrinho.get(produto) - quantidade;
            if (restante > 0) {
                carrinho.put(produto, restante);
            } else {
                carrinho.put(produto, 0);
            }
        }
    }

    public int calculaValorTotal() {
        int total = 0;
        for (Produto produto : carrinho.keySet()) {
            int quantidade = carrinho.get(produto);
            total += produto.preco * quantidade;
        }
        return total;
    }
}
