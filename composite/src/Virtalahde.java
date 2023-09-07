public class Virtalahde implements Laiteosa {

    int hinta = 140;

    public int annaHinta() {
        System.out.println("Virtalähde: Asus ROG Strix 750W");
        System.out.println("Hinta: " + hinta + "€");
        return hinta;
    }

    public void lisaaOsa(Laiteosa laiteosa) {
        throw new RuntimeException("Ei pystytä lisäämään osaa.");
    }

}
