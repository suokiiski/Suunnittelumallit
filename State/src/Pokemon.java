public class Pokemon {

    private Evolving evolution;

    public Pokemon() {
        evolution = new Pichu();
    }

    public void attack() {
        evolution.attack(this);
    }

    public void gainLevel() {
        evolution.gainLevel(this);
    }

    public void setEvolution(Evolving evolving) {
        evolution = evolving;
    }
}