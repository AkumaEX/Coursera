public class Produto {

    protected String nome;
    protected int codigo;
    protected int preco;

    public Produto(String nome, int codigo, int preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Produto) {
            Produto produto = (Produto) obj;
            return codigo == produto.codigo;
        }
        return false;
    }

    @Override
    public int hashCode() {
        Integer codigo = this.codigo;
        return codigo.hashCode();
    }
}
