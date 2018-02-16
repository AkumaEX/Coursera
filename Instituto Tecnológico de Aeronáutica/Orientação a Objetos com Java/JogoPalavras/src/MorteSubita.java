public class MorteSubita implements MecanicaDoJogo {

    private boolean errou;
    private int pontuacao;
    private int multiplicador;
    private String palavra;
    private BancoDePalavras banco;

    public MorteSubita() {
        this.errou = false;
        this.pontuacao = 0;
        this.multiplicador = 1;
        this.banco = new BancoDePalavras();
        this.palavra = banco.getPalavraAleatoria();
    }

    @Override
    public boolean acabou() {
        return this.errou;
    }

    @Override
    public boolean acertou(String palavra) {
        if (this.palavra.equals(palavra)) {
            this.pontuacao += this.palavra.length() * this.multiplicador;
            return true;
        } else {
            this.errou = true;
            return false;
        }
    }

    @Override
    public void continuar() {
        this.palavra = banco.getPalavraAleatoria();
        this.multiplicador += this.multiplicador * 2;
    }

    @Override
    public int getPontuacao() {
        return this.pontuacao;
    }

    @Override
    public String getPalavra() {
        return this.palavra;
    }
}
