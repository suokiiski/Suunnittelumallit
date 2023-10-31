import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Syötä pelaajien määrä: ");
        int pelaajaMaara = scanner.nextInt();

        Thread[] pelaajat = new Thread[pelaajaMaara];
        Pelaaja[] pelaajaObj = new Pelaaja[pelaajaMaara];
        CountDownLatch startSignal = new CountDownLatch(1);
        ReentrantLock lock = new ReentrantLock();


        for (int i = 0; i < pelaajat.length; i++) {
            Pelaaja pelaaja = new Pelaaja(arvuuttaja, i, startSignal, lock);
            pelaajaObj[i] = pelaaja;
            Thread pelaajaThread = new Thread(pelaaja);
            pelaajat[i] = pelaajaThread;
            arvuuttaja.liityPeliin(pelaaja);
        }

        for (Thread pelaaja : pelaajat) {
            pelaaja.start();
        }

        startSignal.countDown();

        try {
            for (Thread pelaaja : pelaajat) {
                pelaaja.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}