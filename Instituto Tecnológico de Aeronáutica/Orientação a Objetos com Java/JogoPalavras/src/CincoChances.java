public class CincoChances implements MecanicaDoJogo {

    private int chances;
    private int pontuacao;
    private String palavra;
    private BancoDePalavras banco;

    public CincoChances() {
        this.chances = 5;
        this.pontuacao = 0;
        this.banco = new BancoDePalavras();
        this.palavra = banco.getPalavraAleatoria();
    }

    @Override
    public boolean acabou() {
        return this.chances == 0;
    }

    @Override
    public boolean acertou(String palavra) {
        if (this.palavra.equals(palavra)) {
            this.chances = 5;
            this.pontuacao += this.palavra.length();
            return true;
        } else {
            this.chances--;
            return false;
        }
    }

    @Override
    public void continuar() {
        this.palavra = banco.getPalavraAleatoria();
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
