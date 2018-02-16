public class FabricaEmbaralhadores {

    public static Embaralhador getEmbaralhador() {
        double aleatorio = Math.random();
        if (aleatorio < 0.5) return new Inverso();
        else return new Permutado();
    }
}
