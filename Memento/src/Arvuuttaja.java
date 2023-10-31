import java.util.Random;

public class Arvuuttaja {

    private Random random = new Random();
    private int pelaajaNumeroCounter = 0;

    public synchronized void liityPeliin(Pelaaja pelaaja) {
        pelaaja.lisaaMemento(new Memento(random.nextInt(10)));
        pelaaja.setPelaajaNumero(pelaajaNumeroCounter++);
    }

    public synchronized boolean arvaaNumero(Pelaaja pelaaja, int arvaus) {
        Memento memento = (Memento)pelaaja.getMemento();
        return memento.getNumero() == arvaus;
    }

    class Memento {

        private final int numero;

        public Memento(int numero) {
            this.numero = numero;
        }

        public int getNumero() {
            return numero;
        }
    }
}