public class Herkkusieni extends Taytteet {
    public Herkkusieni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double haeHinta() {
        double hinta = 3.99;
        return pizza.haeHinta() + hinta;
    }

    @Override
    public String haeTiedot() {
        return pizza.haeTiedot() + " Herkkusieni";
    }
}
