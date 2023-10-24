import java.util.ArrayList;
import java.util.List;

public class Listaus {

    private Strategy strategy;
    private List<String> list;

    public Listaus(Strategy strategy) {
        this.strategy = strategy;
        this.list = new ArrayList<>();
    }

    public void add(String nimi) {
        list.add(nimi);
    }

    public void printList() {
        strategy.listToString(list);

        for(String n : list) {
           System.out.println(n);
        }
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

}