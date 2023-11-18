public class Client {

    private NewGUIInterface newGUI;

    public Client(NewGUIInterface newGUI) {
        this.newGUI = newGUI;
    }

    public void createGUI() {
        newGUI.drawWindow();
        newGUI.drawButton();
        newGUI.drawText();
    }

}
