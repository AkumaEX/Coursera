public class Permutado implements Embaralhador {

    @Override
    public String embaralha(String palavra) {
        int tamanho = palavra.length();
        StringBuilder permutado = new StringBuilder();

        for (int i = 1; i < tamanho; i += 2) {
            permutado.append(palavra.charAt(i));
            permutado.append(palavra.charAt(i - 1));
        }

        if (impar(tamanho)) permutado.append(palavra.charAt(tamanho - 1));

        return permutado.toString().toLowerCase();
    }

    private boolean impar(int tamanho) {
        return tamanho % 2 != 0;
    }
}
