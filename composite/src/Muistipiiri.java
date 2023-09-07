public class Muistipiiri implements Laiteosa {

    int hinta = 150;

    public int annaHinta() {
        System.out.println("Muistipiiri: Kingston Fury Beast DDR5 RGB");
        System.out.println("Hinta: " + hinta + "€");
        return hinta;
    }

    public void lisaaOsa(Laiteosa laiteosa) {
        throw new RuntimeException("Ei pystytä lisäämään osaa.");
    }
}
