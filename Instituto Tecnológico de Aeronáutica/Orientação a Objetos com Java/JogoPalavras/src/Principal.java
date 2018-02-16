import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class Principal {

    // mostra uma breve descrição do modo Cinco Chances
    public static void apresentaCincoChances() {
        System.out.println("Cinco Chances");
        System.out.println("Você possui cinco chances de acertar a palavra secreta");
        System.out.println("Se acertar a palavra você pode continuar com 5 chances");
        System.out.println("ou desistir se desejar");
    }

    // mostra uma breve descrição do modo Morte Súbita
    public static void apresentaMorteSubita() {
        System.out.println("Morte Súbita");
        System.out.println("Vocẽ possui uma única chance de acertar a palavra secreta");
        System.out.println("Se acertar a palavra você pode continuar valendo o dobro");
        System.out.println("de pontos ou desistir se desejar");
    }

    // devolve uma mecânica de jogo escolhido pelo usuário através Fábrica de Mecânica do Jogo
    public static MecanicaDoJogo getMecanica(Scanner in) {
        System.out.println("Digite:");
        System.out.println("1 - para escolher o modo 'Cinco Chances'");
        System.out.println("2 - para escolher o modo 'Morte Súbita'");
        String escolha = in.nextLine();
        while (true) {
            if (escolha.equals("1") || escolha.equals("2")) {
                return FabricaMecanicaDoJogo.getMecanica(Integer.parseInt(escolha));
            }
            System.out.println("Escolha inválida. Por favor digite uma escolha válida (1/2):");
            escolha = in.nextLine();
        }
    }

    // mostra a palavra embaralhada pelo embaralhador escolhido aleatoriamente pela Fábrica de Embaralhadores
    public static void mostrarPalavraEmbaralhada(String palavra) {
        System.out.println("Tente advinhar o nome desse animal:");
        Embaralhador embaralhador = FabricaEmbaralhadores.getEmbaralhador();
        System.out.println(embaralhador.embaralha(palavra));
    }

    // devolve a palavra digitado pelo usuário se ela não for vazia
    public static String digitePalavra(Scanner in) {
        System.out.println("Tente adivinhar ;)");
        String digitado = in.nextLine();
        while (true) {
            if (!digitado.isEmpty()) {
                return digitado;
            }
            digitado = in.nextLine();
        }
    }

    // pergunta ao usuário se deseja continuar o jogo
    public static boolean desejaContinuar(Scanner in) {
        System.out.println("Deseja continuar? (s/n)");
        String escolha = in.nextLine();
        while (true) {
            if (escolha.equals("s")) {
                return true;
            }
            if (escolha.equals("n")) {
                return false;
            }
            System.out.println("Escolha inválida. Por favor digite uma escolha válida (s/n):");
            escolha = in.nextLine();
        }
    }

    // imprime uma mensagem de acerto
    public static void mensagemAcerto() {
        System.out.println("Parabéns! Você acertou :)");
    }

    // imprime uma mensagem de erro
    public static void mensagemErro() {
        System.out.println("Infelizmente você errou :(");
    }

    // imprime uma linha divisória
    public static void linha() {
        System.out.println("============================================================");
    }

    // mostra o total de pontos acumulados no jogo
    public static void mostrarTotalDePontos(int pontuacao) {
        System.out.println("Fim de Jogo. Total de pontos: " + pontuacao);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        linha();
        apresentaCincoChances();
        linha();
        apresentaMorteSubita();
        linha();
        MecanicaDoJogo mecanica = getMecanica(in);
        linha();
        mostrarPalavraEmbaralhada(mecanica.getPalavra());

        while (!mecanica.acabou()) {
            String digitado = digitePalavra(in);
            if (mecanica.acertou(digitado)) {
                mensagemAcerto();
                if (desejaContinuar(in)) {
                    mecanica.continuar();
                    linha();
                    mostrarPalavraEmbaralhada(mecanica.getPalavra());
                } else {
                    break;
                }
            } else {
                mensagemErro();
            }
        }
        linha();
        mostrarTotalDePontos(mecanica.getPontuacao());
        in.close();
    }
}
