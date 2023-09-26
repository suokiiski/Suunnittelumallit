public class Raichu extends Evolving {

    private int level = 34;

    @Override
    public void gainLevel(Pokemon pokemon) {
        for (level = 34; level <= 50; level++) {
            attack(pokemon);
            System.out.println("Raichu's level: " + level);
            if (level == 50) {
                evolve(pokemon);
            }
        }
    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Raichu uses Thunderbolt!");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("Raichu has reached it's highest level!");
    }

}
