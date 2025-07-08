import controllers.Mapa;

public class App {
    public static void main(String[] args) {
        runMapExample();
    }

    private static void runMapExample() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemplosConTreeMap();
    }
}