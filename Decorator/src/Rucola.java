public class Rucola extends Taytteet {
    public Rucola(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double haeHinta() {
        double hinta = 1.99;
        return pizza.haeHinta() + hinta;
    }

    @Override
    public String haeTiedot() {
        return pizza.haeTiedot() + " Rucola";
    }
}
