import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BancoDePalavras {

    File arquivo;

    protected List<String> getLista() {
        try {
            List<String> lista = new ArrayList<>();
            BufferedReader leitor = new BufferedReader(new FileReader("palavras.txt"));
            String linha;
            while ((linha = leitor.readLine()) != null) {
                lista.add(linha);
            }
            leitor.close();
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getPalavraAleatoria() {
        List<String> lista = getLista();
        int tamanho = lista.size();
        int indice = (int) (Math.random() * tamanho);
        return lista.get(indice);
    }
}