public class Pichu extends Evolving {

    private int level = 1;
    private Pokemon pokemon;

    @Override
    public void gainLevel(Pokemon pokemon) {
        level++;
        attack(pokemon);
        System.out.println("Pichu's level: " + level);
        if (level == 16) {
            evolve(pokemon);
        }
        pokemon.acceptVisitor(new EvolutionDecisionVisitor(pokemon));
    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Pichu uses Nuzzle!");
    }

    public void evolve(Pokemon pokemon) {
        pokemon.setEvolution(new Pikachu());
        System.out.println("Pichu evolved into Pikachu!");
    }

    @Override
    public void accept(EvolutionVisitor visitor) {
        visitor.visit(this, pokemon);
    }

    public int getLevel() {
        return level;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }
}