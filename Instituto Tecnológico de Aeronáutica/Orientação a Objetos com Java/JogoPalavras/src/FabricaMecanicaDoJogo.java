public class FabricaMecanicaDoJogo {

    public static MecanicaDoJogo getMecanica(int escolha) {
        if (escolha == 1) return new CincoChances();
        else return new MorteSubita();
    }
}
