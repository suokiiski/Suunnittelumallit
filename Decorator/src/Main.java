public class Main {
    public static void main(String[] args) {

        Pizza tilaus1 = new Tomaattikastike(new Juusto(new Voner(new Pohja())));
        System.out.println(tilaus1.haeTiedot());
        System.out.println(tilaus1.haeHinta());

        Pizza tilaus2 = new Herkkusieni(new Juusto(new Rucola(new Pohja())));
        System.out.println(tilaus2.haeTiedot());
        System.out.println(tilaus2.haeHinta());

        Pizza tilaus3 = new Kinkku(new Juusto((new Tomaattikastike(new Pohja()))));
        System.out.println(tilaus3.haeTiedot());
        System.out.println(tilaus3.haeHinta());
    }
}