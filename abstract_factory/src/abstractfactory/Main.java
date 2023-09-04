package abstractfactory;

public class Main {
    public static void main(String[] args) {

        Vaatetehdas addutehdas = new Adidastehdas();
        Vaatetehdas bosstehdas = new Bosstehdas();

        Koodaaja jasper = new Koodaaja(addutehdas);
        jasper.luoFitti();
        jasper.pue();

        jasper.valitseTehdas(bosstehdas);
        jasper.luoFitti();
        jasper.pue();
    }
}