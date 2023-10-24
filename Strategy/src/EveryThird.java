import java.util.List;

public class EveryThird implements Strategy {

    public String listToString(List<String> list) {
        String print = "";

        for (int i = 0; i < list.size(); i++){
            print += list.get(i);

            if (i < list.size() - 1) {
                print += "\n";
            }
            i += 2;
        }
        return print;
    }

}