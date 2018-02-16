public interface MecanicaDoJogo {

    boolean acabou();

    boolean acertou(String palavra);

    void continuar();

    int getPontuacao();

    String getPalavra();
}
