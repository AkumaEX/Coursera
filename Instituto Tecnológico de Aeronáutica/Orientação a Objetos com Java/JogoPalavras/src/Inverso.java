public class Inverso implements Embaralhador {

    @Override
    public String embaralha(String palavra) {
        return new StringBuilder(palavra).reverse().toString().toLowerCase();
    }
}
