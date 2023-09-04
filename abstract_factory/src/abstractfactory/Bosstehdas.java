package abstractfactory;

public class Bosstehdas implements Vaatetehdas {

    public Paita luoPaita(){
        return new Bosspaita();
    }

    public Housut luoHousut() {
        return new Bosshousut();
    };

    public Kengat luoKengat() {
        return new Bosskengat();
    };

    public Lippis luoLippis() {
        return new Bosslippis();
    };

}
