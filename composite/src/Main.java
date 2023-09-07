public class Main {
    public static void main(String[] args) {

        Laiteosa emoJaOsat = new Emolevy();
        Laiteosa nayttis = new Naytonohjain();
        Laiteosa prossu = new Prosessori();

        emoJaOsat.lisaaOsa(nayttis);
        emoJaOsat.lisaaOsa(prossu);

        int emokokonaisuus = emoJaOsat.annaHinta();
        System.out.println("Välisumma: " + emokokonaisuus + "€");

        Laiteosa koteloJaOsat = new Kotelo();
        Laiteosa virta = new Virtalahde();
        Laiteosa muisti = new Muistipiiri();

        koteloJaOsat.lisaaOsa(virta);
        koteloJaOsat.lisaaOsa(muisti);

        int kotelokokonaisuus = koteloJaOsat.annaHinta();
        System.out.println("Välisumma: " + kotelokokonaisuus + "€");

        int koneenHinta = emokokonaisuus + kotelokokonaisuus;
        System.out.println("Loppusumma: " + koneenHinta + "€");
    }
}