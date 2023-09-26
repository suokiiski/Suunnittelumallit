public class Pikachu extends Evolving {

    private int level = 16;

    @Override
    public void gainLevel(Pokemon pokemon) {
        for (; level <= 34; level++) {
            attack(pokemon);
            System.out.println("Pikachu's level: " + level);
            if (level == 34) {
                evolve(pokemon);
            }
        }
    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Pikachu uses Thunder Shock!");
    }

    public void evolve(Pokemon pokemon) {
        pokemon.setEvolution(new Raichu());
        System.out.println("Pikachu evolved into Raichu!");
    }

}
