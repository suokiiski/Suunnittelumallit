package factorymethod;

public class Rehtori extends AterioivaOtus {

    public Juoma createJuoma() {
        return new Shamppanja();
    }

    public Ruoka createRuoka() {
        return new Salaatti();
    }

}
