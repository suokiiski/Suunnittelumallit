package abstractfactory;

public class Adidastehdas implements Vaatetehdas {

    public Paita luoPaita(){
        return new Adidaspaita();
    }

    public Housut luoHousut() {
        return new Adidashousut();
    };

    public Kengat luoKengat() {
        return new Adidaskengat();
    };

    public Lippis luoLippis() {
        return new Adidaslippis();
    };

}
