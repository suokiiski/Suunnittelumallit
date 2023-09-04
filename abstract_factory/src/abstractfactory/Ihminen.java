package abstractfactory;

public abstract class Ihminen {

    Kengat kengat;
    Paita paita;
    Housut housut;
    Lippis lippis;
    Vaatetehdas vaatetehdas;

    public Ihminen (Vaatetehdas vaatetehdas) {
        this.vaatetehdas = vaatetehdas;
        luoFitti();
    }

    public void valitseTehdas(Vaatetehdas vaatetehdas) {
        this.vaatetehdas = vaatetehdas;
        luoFitti();
    }

    public void luoFitti() {
        lippis = vaatetehdas.luoLippis();
        paita = vaatetehdas.luoPaita();
        housut = vaatetehdas.luoHousut();
        kengat = vaatetehdas.luoKengat();
    }

    public void pue() {
        System.out.println("Jasperin fitti: " + lippis + ", " + paita + ", " + housut + " ja " + kengat + ".");
    }

}
