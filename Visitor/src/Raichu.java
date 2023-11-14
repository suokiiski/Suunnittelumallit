public class Raichu extends Evolving {

    private int level = 34;
    private Pokemon pokemon;

    @Override
    public void gainLevel(Pokemon pokemon) {
        level++;
        attack(pokemon);
        System.out.println("Raichu's level: " + level);
        if (level == 50) {
            System.out.println("Raichu has reached its highest level!");
        }
        pokemon.acceptVisitor(new EvolutionDecisionVisitor(pokemon));
    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Raichu uses Thunderbolt!");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("Raichu has reached it's highest level!");
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