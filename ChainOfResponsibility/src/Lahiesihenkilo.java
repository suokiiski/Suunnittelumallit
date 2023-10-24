public class Lahiesihenkilo extends Handler {

    private final double SALLITTU = 2.0;

    public void processRequest(Pyynto pyynto) {
        if (pyynto.getProsentti() <= SALLITTU) {
            System.out.println("Lähiesihenkilö antaa palkankorotusprosentin " + pyynto.getProsentti());
        }
        else {
            super.processRequest(pyynto);
        }
    }

}
