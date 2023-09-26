public class Pichu extends Evolving {

    private int level = 1;

    @Override
    public void gainLevel(Pokemon pokemon) {
        for (; level <= 16; level++) {
            attack(pokemon);
            System.out.println("Pichu's level: " + level);
            if (level == 16) {
                evolve(pokemon);
            }
        }
    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Pichu uses Nuzzle!");
    }

    public void evolve(Pokemon pokemon) {
        pokemon.setEvolution(new Pikachu());
        System.out.println("Pichu evolved into Pikachu!");
    }

}
