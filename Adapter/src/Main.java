public class Main {
    public static void main(String[] args) {

        OldGUI oGUI = new OldGUI();
        GUIAdapter GUIa = new GUIAdapter(oGUI);
        Client client = new Client(GUIa);

        client.createGUI();
    }
}