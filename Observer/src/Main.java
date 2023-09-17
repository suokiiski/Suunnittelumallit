public class Main {

    public static void main(String[] args) throws InterruptedException {

        ClockTimer timer = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock(timer);

        while (true) {
            timer.tick();
            Thread.sleep(1000);
        }
    }
}