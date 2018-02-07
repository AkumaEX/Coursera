public class ProdutoComTamanho extends Produto {

    protected int tamanho;

    public ProdutoComTamanho(String nome, int codigo, int preco, int tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ProdutoComTamanho) {
            ProdutoComTamanho produto = (ProdutoComTamanho) obj;
            boolean codigos_iguais = this.codigo == produto.codigo;
            boolean tamanhos_iguais = this.tamanho == produto.tamanho;
            return codigos_iguais && tamanhos_iguais;
        }
        return false;
    }

    @Override
    public int hashCode() {
        Integer codigo = this.codigo;
        Integer tamanho = this.tamanho;
        return codigo.hashCode() + tamanho.hashCode();
    }
}