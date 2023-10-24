public class Main {

    public static void main(String[] args) {

        Listaus listaus = new Listaus(new EveryItem());

        listaus.add("Pekka");
        listaus.add("Irma");
        listaus.add("Jarno");
        listaus.add("Helmi");
        listaus.add("Kalevi");
        listaus.add("Paavo");

        System.out.println("EveryItem.java:");
        listaus.printList();

        listaus.setStrategy(new EverySecond());
        System.out.println("EverySecond.java:");
        listaus.printList();

        listaus.setStrategy(new EveryThird());
        System.out.println("EveryThird.java:");
        listaus.printList();

    }

}