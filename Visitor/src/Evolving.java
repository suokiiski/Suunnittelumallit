public abstract class Evolving {

    abstract void gainLevel(Pokemon pokemon);
    abstract void attack(Pokemon pokemon);
    abstract void evolve(Pokemon pokemon);
    abstract void accept(EvolutionVisitor visitor);

}