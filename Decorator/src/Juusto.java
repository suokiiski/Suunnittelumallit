public class Juusto extends Taytteet {
    public Juusto(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double haeHinta() {
        double hinta = 0.99;
        return pizza.haeHinta() + hinta;
    }

    @Override
    public String haeTiedot() {
        return pizza.haeTiedot() + " Juusto";
    }
}
