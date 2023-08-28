package factorymethod;

public class Opiskelija extends AterioivaOtus {

    public Juoma createJuoma() {
        return new Vesi();
    };

    public Ruoka createRuoka() {
        return new Broileripyorykat();
    }

}
