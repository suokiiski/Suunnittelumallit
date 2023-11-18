package osat;

public class Sampyla {

    String osa;

    public Sampyla(String osa) {
        this.osa = osa;
    }

    public String getOsa() {
        return osa;
    }

    public void setOsa(String osa) {
        this.osa = osa;
    }

    @Override
    public String toString() {
        return getOsa();
    }
}
