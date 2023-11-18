import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Tyontekija tt = new Tyontekija();
        Hesburger hese = new Hesburger();
        McDonalds makki = new McDonalds();

        tt.setHampurilainen(hese);
        tt.rakennaHamppari();
        StringBuilder heseHamppari = hese.getHampurilainen();
        System.out.println(heseHamppari);

        tt.setHampurilainen(makki);
        tt.rakennaHamppari();
        ArrayList<Object> makkiHamppari = makki.getHampurilainen();
        System.out.println(makkiHamppari);

    }
}