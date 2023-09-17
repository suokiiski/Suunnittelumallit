import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {

    private ClockTimer timer;

    public DigitalClock(ClockTimer ct) {
        timer = ct;
        ct.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof ClockTimer) {
            draw();
            System.out.println("Digitaalinen kello päivittyi.");
        }
    }

    private void draw() {
        int hour = timer.getHour();
        int min = timer.getMinute();
        int sec = timer.getSecond();
        System.out.println("Digitaalinen kello: " + hour + ":" + min + ":" + sec);
    }
}