package osat;

public class Juusto {

    String osa;

    public Juusto(String osa) {
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
