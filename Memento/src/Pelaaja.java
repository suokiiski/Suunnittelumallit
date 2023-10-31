import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

public class Pelaaja extends Thread {

    private final Arvuuttaja arvuuttaja;
    private int pelaajaNumero;
    private Object pelaajaObj;
    private Random  random = new Random();
    private static boolean arvaako = true;
    private CountDownLatch startSignal;
    private ReentrantLock lock;

    public Pelaaja(Arvuuttaja arvuuttaja, int pelaajaNumero, CountDownLatch startSignal, ReentrantLock lock) {
        this.arvuuttaja = arvuuttaja;
        this.pelaajaNumero = pelaajaNumero + 1;
        this.startSignal = startSignal;
        this.lock = lock;
    }

    public void lisaaMemento(Object pelaajaObj) {
        this.pelaajaObj = pelaajaObj;
    }

    public Object getMemento() {
        return pelaajaObj;
    }

    public void setPelaajaNumero(int pelaajaNumero) {
        this.pelaajaNumero = pelaajaNumero;
    }

    @Override
    public void run() {
        try {
            startSignal.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (Pelaaja.arvaako) {
            lock.lock();
            if (arvuuttaja.arvaaNumero(this, random.nextInt(10))) {
                System.out.println("Pelaaja nro. " + (pelaajaNumero + 1) + " arvasi oikein");
                Pelaaja.arvaako = false;
                lock.unlock();
            } else {
                System.out.println("Pelaaja nro. " + (pelaajaNumero + 1) + " arvasi väärin.");
                lock.unlock();
            }
        }
    }
}