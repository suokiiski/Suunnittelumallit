import java.util.List;

public class EverySecond implements Strategy {

    public String listToString(List<String> list) {
        String print = "";

        for (int i = 0; i < list.size(); i++){
            print += list.get(i);

            if (i < list.size() - 1) {
                print += "\n";
            }
            i++;
        }
        return print;
    }

}