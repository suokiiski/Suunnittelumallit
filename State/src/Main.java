public class Main {
    public static void main(String[] args) throws InterruptedException {

        Pokemon pichuPokemon = new Pokemon();

        System.out.println("Pichun evoluutio alkaa.");

        for (int i = 0; i < 3; i++) {
            pichuPokemon.attack();
            pichuPokemon.gainLevel();
            Thread.sleep(1000);
        }
    }
}