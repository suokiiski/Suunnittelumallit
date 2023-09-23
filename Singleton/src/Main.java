public class Main {

    public static void main(String[] args) {

        Istunto istunto = Istunto.getInstance();

        Kayttaja kayttaja1 = new Kayttaja();
        kayttaja1.setKayttajanimi("nimimerkki9000");
        kayttaja1.setSalasana("salasana123");

        Kayttaja kayttaja2 = new Kayttaja();
        kayttaja2.setKayttajanimi("nikki13");
        kayttaja2.setSalasana("eiole");

        istunto.lisaaKayttaja(kayttaja1);
        istunto.lisaaKayttaja(kayttaja2);

        System.out.println(kayttaja1.getKayttajanimi());
        System.out.println(kayttaja1.getSalasana());

        System.out.println(kayttaja2.getKayttajanimi());
        System.out.println(kayttaja2.getSalasana());
    }
}