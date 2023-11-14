public class Pokemon {

    private Evolving evolution;
    private EvolutionDecisionVisitor visitor;

    public Pokemon() {
        evolution = new Pichu();
        visitor = new EvolutionDecisionVisitor(this);
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

    public void acceptVisitor(EvolutionVisitor visitor) {
        evolution.accept(visitor);
    }

}