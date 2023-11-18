import java.util.ArrayList;
import osat.*;

public class McDonalds implements IHampurilainen {
    // Konkreettinen builder ArrayListilla

    private ArrayList<Object> burgeriL;

    @Override
    public void luoHampurilainen() {
        burgeriL = new ArrayList<>();
    }

    @Override
    public void lisaaSampyla() {
        burgeriL.add(new Sampyla("McDonaldsin sämpylä"));
    }

    @Override
    public void lisaaPihvi() {
        burgeriL.add(new Pihvi("McDonaldsin pihvi"));
    }

    @Override
    public void lisaaJuusto() {
        burgeriL.add(new Juusto("McDonaldsin juusto"));
    }

    @Override
    public ArrayList<Object> getHampurilainen() {
        return burgeriL;
    }

}
