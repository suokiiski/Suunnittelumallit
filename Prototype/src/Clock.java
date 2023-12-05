public class Clock implements Cloneable {

    private Pointer hours;
    private Pointer minutes;

    public Clock (int hours, int minutes) {
        this.hours = new Pointer(hours);
        this.minutes = new Pointer(minutes);
    }

    public void setTime(int hours, int minutes) {
        this.hours.setNumber(hours);
        this.minutes.setNumber(minutes);
    }

    public String showTime() {
        return hours.getNumber() + "." + minutes.getNumber();
    }

    // Kloonaus
    @Override
    public Clock clone() throws CloneNotSupportedException {
        Clock clone = (Clock) super.clone();
        clone.hours = (Pointer) hours.clone();
        clone.minutes = (Pointer) minutes.clone();
        return clone;
    }

    public Clock shallowClone() throws CloneNotSupportedException {
        return (Clock) super.clone();
    }

}
