public class Voner extends Taytteet {
    public Voner(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double haeHinta() {
        double hinta = 3.45;
        return pizza.haeHinta() + hinta;
    }

    @Override
    public String haeTiedot() {
        return pizza.haeTiedot() + " Vöner";
    }
}
