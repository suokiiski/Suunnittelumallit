public class Paallikko extends Handler {

    private final double SALLITTU = 5.0;

    public void processRequest(Pyynto pyynto) {
        if (pyynto.getProsentti() <= SALLITTU) {
            System.out.println("Päällikkö antaa palkankorotusprosentin " + pyynto.getProsentti());
        }
        else {
            super.processRequest(pyynto);
        }
    }


}
