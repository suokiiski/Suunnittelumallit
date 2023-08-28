package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus rehtori = new Rehtori();
        AterioivaOtus opiskelija = new Opiskelija();

        opettaja.aterioi();
        rehtori.aterioi();
        opiskelija.aterioi();
    }

}
