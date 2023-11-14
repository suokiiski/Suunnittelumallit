public class EvolutionDecisionVisitor implements EvolutionVisitor {

    private Pokemon pokemon;

    public EvolutionDecisionVisitor(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void visit(Pichu pichu, Pokemon pokemon) {
        if (pichu.getLevel() >= 16) {
            pichu.getPokemon().setEvolution(new Pikachu());
            System.out.println("Pichu evolved into Pikachu!");
        }
    }

    @Override
    public void visit(Pikachu pikachu, Pokemon pokemon) {
        if (pikachu.getLevel() >= 34) {
            pikachu.getPokemon().setEvolution(new Raichu());
            System.out.println("Pikachu evolved into Raichu!");
        }
    }

    @Override
    public void visit(Raichu raichu, Pokemon pokemon) {
    }
}