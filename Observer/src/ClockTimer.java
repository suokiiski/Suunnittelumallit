import java.util.Observable;
import java.time.LocalDateTime;

public class ClockTimer extends Observable {

    int hour, min, sec;

    public ClockTimer() {
        updateTime();
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.min;
    }

    public int getSecond() {
        return this.sec;
    }

    public void tick() {
        updateTime();
        setChanged();
        notifyObservers();
    }

    private void updateTime() {
        LocalDateTime now = LocalDateTime.now();
        this.hour = now.getHour();
        this.min = now.getMinute();
        this.sec = now.getSecond();
    }
}