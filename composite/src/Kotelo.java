import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {

    int hinta = 75;
    int hintaYhteensa = 0;
    List<Laiteosa> osat = new ArrayList<>();

    public int annaHinta() {
        for (Laiteosa o : osat) {
            hintaYhteensa += o.annaHinta();
        }
        System.out.println("Kotelo: Kolink Observatory Lite Mesh RGB");
        System.out.println("Hinta: " + hinta + "€");
        return hintaYhteensa + hinta;
    }

    public void lisaaOsa(Laiteosa laiteosa) {
        osat.add(laiteosa);
    }
}
