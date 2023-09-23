public class Kinkku extends Taytteet {
    public Kinkku(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double haeHinta() {
        double hinta = 3.49;
        return pizza.haeHinta() + hinta;
    }

    @Override
    public String haeTiedot() {
        return pizza.haeTiedot() + " Kinkku";
    }
}
