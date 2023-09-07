public class Prosessori implements Laiteosa {

    int hinta = 265;

    public int annaHinta() {
        System.out.println("Prosessori: AMD Ryzen 5 7600X");
        System.out.println("Hinta: " + hinta + "€");
        return hinta;
    }

    public void lisaaOsa(Laiteosa laiteosa) {
        throw new RuntimeException("Ei pystytä lisäämään osaa.");
    }

}
