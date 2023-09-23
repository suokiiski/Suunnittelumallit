public abstract class Taytteet implements Pizza {
    protected Pizza pizza;

    public Taytteet(Pizza pizza) {
        this.pizza = pizza;
    }

    public double heaHinta() {
        return pizza.haeHinta();
    }

    public String haeTiedot() {
        return pizza.haeTiedot();
    }
}
