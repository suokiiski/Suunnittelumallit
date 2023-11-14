public class Pikachu extends Evolving {

    private int level = 16;
    private Pokemon pokemon;

    @Override
    public void gainLevel(Pokemon pokemon) {
        level++;
        attack(pokemon);
        System.out.println("Pikachu's level: " + level);
        if (level == 34) {
            evolve(pokemon);
        }
        pokemon.acceptVisitor(new EvolutionDecisionVisitor(pokemon));
    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Pikachu uses Thunder Shock!");
    }

    public void evolve(Pokemon pokemon) {
        pokemon.setEvolution(new Raichu());
        System.out.println("Pikachu evolved into Raichu!");
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