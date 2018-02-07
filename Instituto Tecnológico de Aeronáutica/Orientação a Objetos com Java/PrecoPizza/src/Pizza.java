import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Pizza {

    public static Map<String, Integer> ingredientesUtilizados = new HashMap<>();
    private List<String> ingrediente = new ArrayList<>();

    public void adicionaIngrediente(String ingrediente) {
        this.ingrediente.add(ingrediente);
        contabilizaIngrediente(ingrediente);
    }

    private static void contabilizaIngrediente(String ingrediente) {
        if (ingredientesUtilizados.containsKey(ingrediente)) {
            Integer quantidade = ingredientesUtilizados.get(ingrediente);
            ingredientesUtilizados.put(ingrediente, ++quantidade);
        } else {
            ingredientesUtilizados.put(ingrediente, 1);
        }
    }

    public static void imprimeQuantidadeDeCadaIngrediente() {
        System.out.println("Quantidade utilizada de cada ingrediente por todas as pizzas:");
        for (String ingrediente: ingredientesUtilizados.keySet()) {
            int quantidade = ingredientesUtilizados.get(ingrediente);
            System.out.println(ingrediente + ": " + quantidade);
        }
    }

    public static void zeraRegistroDeIngredientes() {
        ingredientesUtilizados = new HashMap<>();
    }

    public boolean semIngredientes() {
        return ingrediente.size() == 0;
    }

    public int getPreco() {
        int quantidade = ingrediente.size();
        if (quantidade <= 2) return 15;
        else if (quantidade <= 5) return 20;
        else return 23;
    }
}
