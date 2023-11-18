public class GUIAdapter implements NewGUIInterface {
    // Sovitin

    private OldGUI oldGUI;

    public GUIAdapter(OldGUI oldGUI) {
        this.oldGUI = oldGUI;
    }

    @Override
    public void drawWindow() {
        oldGUI.createWindow();
    }

    @Override
    public void drawButton() {
        oldGUI.createButton();
    }

    @Override
    public void drawText() {
        oldGUI.createText();
    }

}
