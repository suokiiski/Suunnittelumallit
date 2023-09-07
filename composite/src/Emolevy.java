import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {

    int hinta = 230;
    int hintaYhteensa = 0;
    List<Laiteosa> osat = new ArrayList<>();

    public int annaHinta() {
        for (Laiteosa o : osat) {
            hintaYhteensa += o.annaHinta();
        }
        System.out.println("Emolevy: MSI MAG B650 TOMAHAWK WIFI");
        System.out.println("Hinta: " + hinta + "€");
        return hinta + hintaYhteensa;
    }

    public void lisaaOsa(Laiteosa laiteosa) {
        osat.add(laiteosa);
    }
}