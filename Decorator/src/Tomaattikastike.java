public class Tomaattikastike extends Taytteet {
    public Tomaattikastike(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double haeHinta() {
        double hinta = 0.99;
        return pizza.haeHinta() + hinta;
    }

    @Override
    public String haeTiedot() {
        return pizza.haeTiedot() + " Tomaattikastike";
    }
}
