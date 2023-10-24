public class Toimitusjohtaja extends Handler {

    public void processRequest(Pyynto pyynto) {
        System.out.println("Toimitusjohtaja antaa palkankorotusprosentin " + pyynto.getProsentti());
    }

}
