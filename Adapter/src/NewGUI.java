public class NewGUI implements NewGUIInterface {
    // Asiakas

    @Override
    public void drawWindow() {
        System.out.println("Uusi ikkuna luotu.");
    }

    @Override
    public void drawButton() {
        System.out.println("Uusi nappi luotu.");
    }

    @Override
    public void drawText() {
        System.out.println("Uusi teksti luotu.");
    }

}
