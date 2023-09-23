public class Istunto {

    private Kayttaja kayttaja;
    private static Istunto INSTANCE = null;

    private Istunto() {
    }

    public static Istunto getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Istunto();
        }
        return INSTANCE;
    }

    public void lisaaKayttaja(Kayttaja kayttaja) {
        this.kayttaja = kayttaja;
    }

}