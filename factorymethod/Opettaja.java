package factorymethod;

public class Opettaja extends AterioivaOtus {
    public Juoma createJuoma(){
        return new Kahvi();
    };

    public Ruoka createRuoka() {
        return new Kalakeitto();
    }
}
