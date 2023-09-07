public class Naytonohjain implements Laiteosa {

    int hinta = 370;

    public int annaHinta() {
        System.out.println("Näytönohjain: Sapphire Radeon RX 6700 PULSE");
        System.out.println("Hinta: " + hinta + "€");
        return hinta;
    }

    public void lisaaOsa(Laiteosa laiteosa) {
        throw new RuntimeException("Ei pystytä lisäämään osaa.");
    }

}
